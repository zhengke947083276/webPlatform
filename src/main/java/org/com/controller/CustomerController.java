package org.com.controller;

import org.com.entity.TblCustomer;
import org.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    HttpSession session;
    @RequestMapping("/login")
    public String login(TblCustomer tblCustomer){
        TblCustomer customer = customerService.select(tblCustomer.getCustomerTelnum(), tblCustomer.getCustomerPassword());
        session.setAttribute("user",customer);
        return "redirect:/item/selectAll";
    }

    @RequestMapping("/exit")
    public String exit(){
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/item/selectAll";
    }
}
