package com.service;

import com.dao.DeptDao;
import com.entity.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;


    @Override
    public List<Dept> queryAll() {
        // TODO Auto-generated method stub
        deptDao.queryAll();
        return deptDao.queryAll();
    }

}
