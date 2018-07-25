package org.com.service.impl;

import org.com.dao.TblItemMapper;
import org.com.entity.TblItem;
import org.com.entity.TblItemExample;
import org.com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    TblItemMapper tblItemMapper;
    @Override
    public int insert(TblItem tblItem) {
        tblItem.setItemTime(new Date());
        return tblItemMapper.insertSelective(tblItem);
    }

    @Override
    public int delete(int itemId) {
        return tblItemMapper.deleteByPrimaryKey(itemId);
    }

    @Override
    public int update(TblItem tblItem) {
        return tblItemMapper.updateByPrimaryKeySelective(tblItem);
    }

    @Override
    public List<TblItem> selectAllByCustomerId(int customerId) {
        TblItemExample tblItemExample = new TblItemExample();
        TblItemExample.Criteria criteria = tblItemExample.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);
        List<TblItem> tblItems = tblItemMapper.selectByExample(tblItemExample);
        return tblItems;
    }

    @Override
    public TblItem selectByItemId(int itemId) {
        return tblItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public List<TblItem> selectAllByCustomerIdAndItemName(int customerId, String itemName) {
        TblItemExample tblItemExample = new TblItemExample();
        TblItemExample.Criteria criteria = tblItemExample.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);
        criteria.andItemNameLike("%"+itemName+"%");
        List<TblItem> tblItems = tblItemMapper.selectByExample(tblItemExample);
        return tblItems;
    }

    @Override
    public List<TblItem> selectAll() {
        return tblItemMapper.selectByExample(null);
    }

    @Override
    public List<TblItem> selectAllByItemName(String itemName) {
        TblItemExample tblItemExample = new TblItemExample();
        TblItemExample.Criteria criteria = tblItemExample.createCriteria();
        criteria.andItemNameLike("%"+itemName+"%");
        List<TblItem> tblItems = tblItemMapper.selectByExample(tblItemExample);
        return tblItems;
    }
}
