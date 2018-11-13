package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User showone(User user) {
        // TODO Auto-generated method stub
        userDao.query(user);
        return userDao.query(user);
    }

    @Override
    public void regist(User user) {
        // TODO Auto-generated method stub
        userDao.insert(user);
    }


}
