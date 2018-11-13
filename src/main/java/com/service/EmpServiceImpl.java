package com.service;

import com.dao.EmpDao;
import com.entity.Employee;
import com.vo.pageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Employee> showAll() {
        // TODO Auto-generated method stub
        return empDao.queryAll();
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        empDao.delete(id);
    }

    @Override
    public void update(Employee employee) {
        // TODO Auto-generated method stub
        empDao.update(employee);
    }

    @Override
    public void insert(Employee employee) {
        // TODO Auto-generated method stub
        empDao.insert(employee);
    }

    @Override
    public List<Employee> findb(pageBean pagebean) {
        // TODO Auto-generated method stub
        empDao.findb(pagebean);
        return empDao.findb(pagebean);
    }

    @Override
    public int find() {
        // TODO Auto-generated method stub
        empDao.find();
        return empDao.find();
    }

}
