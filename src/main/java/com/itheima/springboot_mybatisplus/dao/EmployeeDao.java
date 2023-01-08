package com.itheima.springboot_mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springboot_mybatisplus.domain.Employee;
import org.apache.ibatis.annotations.Mapper;


//这里的对象名称需要与数据库的名称必须是相同的，就是根据employee来查询表的
@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {
}
