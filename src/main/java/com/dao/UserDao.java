package com.dao;

import com.entity.User;

public interface UserDao {
    public void insert(User user);

    public User query(User user);
}
