package com.emmjay.user.service.services;

import com.emmjay.user.service.entities.User;
import java.util.List;

public interface UserServices {

    //userOperations
    User saveUser(User user);

    //create

    //get all users
    List<User> getAllUsers();


    //get single user of given userID
    public User getUser(String userId);

    //get Single user
    User getUser(User userId);
    //TODO
}