package org.example.quickstart.service.impl;

import org.example.quickstart.dao.UserDao;
import org.example.quickstart.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

}
