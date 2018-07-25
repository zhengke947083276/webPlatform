package org.com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public class ItemServiceTest {
    @Autowired
    ItemService itemService;
    @Test
    public void insert() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void selectAllByCustomerId() {
    }

    @Test
    public void selectByItemId() {
    }

    @Test
    public void selectAllByCustomerIdAndItemName() {
    }
}