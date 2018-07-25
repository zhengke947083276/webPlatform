package org.com.service.impl;

import org.com.dao.TblCustomerMapper;
import org.com.entity.TblCustomer;
import org.com.entity.TblCustomerExample;
import org.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    TblCustomerMapper tblCustomerMapper;
    @Override
    public int insert(TblCustomer tblCustomer) {
        return tblCustomerMapper.insertSelective(tblCustomer);
    }

    @Override
    public TblCustomer select(String customerTelnum, String customerPassword) {
        TblCustomerExample tblCustomerExample = new TblCustomerExample();
        TblCustomerExample.Criteria criteria = tblCustomerExample.createCriteria();
        criteria.andCustomerTelnumEqualTo(customerTelnum);
        criteria.andCustomerPasswordEqualTo(customerPassword);
        List<TblCustomer> tblCustomers = tblCustomerMapper.selectByExample(tblCustomerExample);
        if (tblCustomers!=null && tblCustomers.size()!=0){
            return tblCustomers.get(0);
        }
        return null;
    }

    @Override
    public int update(TblCustomer tblCustomer) {
        return tblCustomerMapper.updateByPrimaryKeySelective(tblCustomer);
    }
}
