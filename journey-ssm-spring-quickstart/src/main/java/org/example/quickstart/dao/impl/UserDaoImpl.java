package org.example.quickstart.dao.impl;

import org.example.quickstart.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("User Repository saving...");
    }

}
