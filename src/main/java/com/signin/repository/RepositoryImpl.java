package com.signin.repository;

import com.signin.data.BookData;
import com.signin.data.UserData;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryImpl implements com.signin.repository.Repository {

    @Autowired
    private SqlSession sqlSession;

    private static final String MAPPER = "mapper.";

    public UserData selectUserByUserId(String userId) {
        return sqlSession.selectOne(MAPPER +"selectUser", userId);
    }

    @Override
    public void insertUserData(UserData userData) {
        sqlSession.selectOne(MAPPER + "insertUserData", userData);
    }

    @Override
    public int countUserData() {
        return sqlSession.selectOne(MAPPER+"countUserData");
    }

    @Override
    public void insertBookData(BookData bookData) {
        sqlSession.selectOne(MAPPER + "insertBookData", bookData);
    }

    @Override
    public int countBookData() {
        return sqlSession.selectOne(MAPPER + "countBookData");
    }

    @Override
    public List<BookData> selectBookDataList(){
        return sqlSession.selectList(MAPPER + "selectBookDataList");
    }
}