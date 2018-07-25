package org.com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.com.entity.TblCustomer;
import org.com.entity.TblItem;
import org.com.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @Autowired
    HttpServletRequest request;
    @Autowired
    ServletContext servletContext;
    @Autowired
    HttpSession session;

    public String itemName;
    private int id(){
        TblCustomer user = (TblCustomer)session.getAttribute("user");
        Integer id=-1;

        if (user!=null){
            id = user.getCustomerId();
        }
        return id;

    }

    @RequestMapping("/selectAll")
    public String selectAll(Model model, @RequestParam(value = "pn",defaultValue = "1")int pn){
        String servletPath = request.getServletPath();
        String contextPath = servletContext.getRealPath("/");
        System.out.println(contextPath);
        model.addAttribute("servletPath",servletPath);
        //引入分页插件
        //查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn,6);
        List<TblItem> tblItems = itemService.selectAll();
        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,c传入连续显示的页数
        PageInfo pageInfo = new PageInfo(tblItems,5);
        model.addAttribute("pageInfo",pageInfo);
        return "/item/main";
    }
    @RequestMapping("/selectAllByItemName")
    public String selectAllByItemName(Model model, @RequestParam(value = "pn",defaultValue = "1")int pn,String itemName){
        String servletPath = request.getServletPath();
        model.addAttribute("servletPath",servletPath);
        if (itemName!=null){
            this.itemName=itemName;
        }
        //引入分页插件
        //查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn,6);
        List<TblItem> tblItems = itemService.selectAllByItemName(this.itemName);
        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,c传入连续显示的页数
        PageInfo pageInfo = new PageInfo(tblItems,5);
        model.addAttribute("pageInfo",pageInfo);
        return "/item/main";
    }


    @RequestMapping("/update")
    @ResponseBody
    public String update(TblItem tblItem){
        tblItem.setCustomerId(id());
        int i = itemService.update(tblItem);
        if (i>0){
            return "{\"success\":true,\"msg\":\"修改成功！\"}";
        }
        return "{\"success\":false,\"msg\":\"修改失败！\"}";
    }



    @RequestMapping("/selectAllMy")
    public String selectAllMy(Model model, @RequestParam(value = "pn",defaultValue = "1")int pn){
        String servletPath = request.getServletPath();
        model.addAttribute("servletPath",servletPath);
        //引入分页插件
        //查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn,6);
        List<TblItem> tblItems = itemService.selectAllByCustomerId(id());
        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,c传入连续显示的页数

        PageInfo pageInfo = new PageInfo(tblItems,5);
        model.addAttribute("pageInfo",pageInfo);
        return "/item/user";
    }
    @RequestMapping("/selectAllByItemNameMy")
    public String selectAllByItemNameMy(Model model, @RequestParam(value = "pn",defaultValue = "1")int pn,String itemName){
        String servletPath = request.getServletPath();
        model.addAttribute("servletPath",servletPath);
        if (itemName!=null){
            this.itemName=itemName;
        }
        //引入分页插件
        //查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn,6);
        List<TblItem> tblItems = itemService.selectAllByCustomerIdAndItemName(id(),this.itemName);
        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,c传入连续显示的页数
        PageInfo pageInfo = new PageInfo(tblItems,5);
        model.addAttribute("pageInfo",pageInfo);
        return "/item/user";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer itemId){
        System.out.println(itemId);
        TblItem tblItem = itemService.selectByItemId(itemId);
        String itemUrl = tblItem.getItemUrl();
        int i = itemService.delete(itemId);
        if (i>0){
            File file = new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 8.0\\webapps",itemUrl+".war");
            file.delete();
            return "OK";
        }
        return "NOOK";
    }


    @RequestMapping("/addUpload")
    @ResponseBody
    public String addUpload(TblItem tblItem,@RequestParam("file") MultipartFile file)throws IOException {
        String originalFilename = file.getOriginalFilename();
        tblItem.setItemTime(new Date());
        String fileName = originalFilename.substring(0, originalFilename.indexOf("."));
        tblItem.setItemUrl(fileName);
        tblItem.setCustomerId(((TblCustomer)session.getAttribute("user")).getCustomerId());
        System.out.println(tblItem);
        int i = itemService.insert(tblItem);
        if (i>0){
            new Thread(){
                @Override
                public void run() {
                    if (!file.isEmpty()){//文件是否存在
                        File file1 = new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 8.0\\webapps",originalFilename);
                        try {
                            FileUtils.copyInputStreamToFile(file.getInputStream(),file1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
            return "OK";
        }
        return "NOOK";
    }

}
