package com.dao;

import com.entity.Employee;
import com.vo.pageBean;

import java.util.List;

public interface EmpDao {
    public List<Employee> queryAll();

    public void delete(int id);

    public void update(Employee employee);

    public void insert(Employee employee);

    public List<Employee> findb(pageBean pagebean);

    public int find();
}
