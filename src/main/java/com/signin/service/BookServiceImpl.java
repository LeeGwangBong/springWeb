package com.signin.service;

import com.signin.data.BookData;
import com.signin.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private static Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    Repository repository;

    @Override
    public void createBookData(BookData bookData) {
        repository.insertBookData(bookData);
    }

    @Override
    public int countBookData() {
        return repository.countBookData();
    }

    public List<BookData> selectBookDataList(){

        List<BookData> list = repository.selectBookDataList();


        return list;
    }
}
