package com.signin.service;

import com.signin.data.UserData;
import com.signin.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    Repository repository;

    @Override
    public boolean isLogin(UserData user) {
        UserData getUser = repository.selectUserByUserId(user.getUserId());
        LOGGER.debug(getUser.getUserPwd()+", "+user.getUserPwd());
        if (getUser.getUserPwd().equals(user.getUserPwd()))
            return true;
        return false;
    }

    @Override
    public void createUserData(UserData userData) {
        repository.insertUserData(userData);
    }

    @Override
    public int countUserData() {
        return repository.countUserData();
    }
}
