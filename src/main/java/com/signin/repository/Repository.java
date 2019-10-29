package com.signin.repository;

import com.signin.data.BookData;
import com.signin.data.UserData;

import java.util.List;

public interface Repository {
    UserData selectUserByUserId(String userId);
    void insertUserData(UserData userData);
    int countUserData();

    void insertBookData(BookData bookData);
    int countBookData();

    List<BookData> selectBookDataList();
}