package org.com.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;
    @Test
    public void insert() {
    }

    @Test
    public void select() {
    }

    @Test
    public void update() {
    }
}