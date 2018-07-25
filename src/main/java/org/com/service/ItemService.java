package org.com.service;

import org.com.entity.TblItem;

import java.util.List;

public interface ItemService {
    /**
     * 部署项目
     * @param tblItem
     * @return
     */
    int insert(TblItem tblItem);

    /**
     * 删除项目
     * @param itemId
     * @return
     */
    int delete(int itemId);


    /**
     * 完善项目信息
     * @param tblItem
     * @return
     */
    int update(TblItem tblItem);

    /**
     * 查看顾客自己所有项目
     * @param customerId
     * @return
     */
    List<TblItem> selectAllByCustomerId(int customerId);
    /**
     *ID查询项目详情
     * @param itemId
     * @return
     */
    TblItem selectByItemId(int itemId);

    /**
     * 顾客自己通过项目名模糊查询
     * @param customerId
     * @param itemName
     * @return
     */
    List<TblItem> selectAllByCustomerIdAndItemName(int customerId,String itemName);

    /**
     * 查看所有项目
     * @return
     */
    List<TblItem> selectAll();

    /**
     * 模糊查询
     * @param itemName
     * @return
     */
    List<TblItem> selectAllByItemName(String itemName);
}
