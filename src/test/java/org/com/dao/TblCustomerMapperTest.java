package org.com.dao;

import org.com.entity.TblCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public class TblCustomerMapperTest {
    @Autowired
    TblCustomerMapper tblCustomerMapper;
    @Test
    public void selectByPrimaryKey() {
        TblCustomer tblCustomer = tblCustomerMapper.selectByPrimaryKey(1);
        System.out.println(tblCustomer);
    }
}