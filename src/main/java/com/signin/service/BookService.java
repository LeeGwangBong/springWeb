package com.signin.service;

import com.signin.data.BookData;

import java.util.List;

public interface BookService {

    void createBookData (BookData bookData);
    int countBookData();
    List<BookData> selectBookDataList();
}
