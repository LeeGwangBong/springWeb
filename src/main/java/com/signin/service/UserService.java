package com.signin.service;

import com.signin.data.UserData;

public interface UserService {
    int countUserData();
    boolean isLogin(UserData user);
    void createUserData(UserData userData);

}