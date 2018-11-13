package com.service;

import com.entity.Employee;
import com.vo.pageBean;

import java.util.List;

public interface EmpService {
    public List<Employee> showAll();

    public void delete(int id);

    public void update(Employee employee);

    public void insert(Employee employee);

    public List<Employee> findb(pageBean pagebean);

    public int find();
}
