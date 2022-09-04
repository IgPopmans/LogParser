package com.project.logparser.service;

import com.project.logparser.model.User;

import java.util.List;


public class UserServiceImpl implements UserService {

    private List<User> userList;

    public UserServiceImpl() {
        //call method to create test data
    }

    @Override
    public User getUserByName(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }

        }
        return null;
    }
}
