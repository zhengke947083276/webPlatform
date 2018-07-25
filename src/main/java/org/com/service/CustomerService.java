package org.com.service;

import org.com.entity.TblCustomer;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public interface CustomerService {
    /**
     * 注册
     * @param tblCustomer
     * @return
     */
    int insert(TblCustomer tblCustomer);

    /**
     * 登录
     * @param customerTelnum
     * @param customerPassword
     * @return
     */
    TblCustomer select(String customerTelnum,String customerPassword);

    /**
     * 修改个人信息
     * @param tblCustomer
     * @return
     */
    int update(TblCustomer tblCustomer);
}
