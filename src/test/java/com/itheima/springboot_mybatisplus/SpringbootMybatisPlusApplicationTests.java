package com.itheima.springboot_mybatisplus;


import com.itheima.springboot_mybatisplus.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.module.ModuleDescriptor;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {


    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {
        System.out.println(employeeDao.selectById(1));
    }

}
