package com.signin.controller;

import com.signin.data.BookData;
import com.signin.data.UserData;
import com.signin.service.BookService;
import com.signin.service.UserService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.awt.print.Book;
import java.util.*;

@RestController
public class SignInRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value="/signin", method= RequestMethod.GET)
    public String SignIn(HttpServletRequest request, @RequestParam String userId, @RequestParam String userPwd) {
        UserData user = new UserData();
        user.setUserId(userId);
        user.setUserPwd(userPwd);

        JSONObject json = new JSONObject();
        json.put("result", userService.isLogin(user));
        return json.toJSONString();
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public void signUp(@RequestParam String userId, @RequestParam String userName, @RequestParam String nickName, @RequestParam String userPwd, @RequestParam String userPhone) {
        UserData user = new UserData();
        user.setUserNum(userService.countUserData()+1);
        user.setUserId(userId);
        user.setNickName(nickName);
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        user.setUserPhone(userPhone);

        userService.createUserData(user);
    }

    @RequestMapping(value="/bookRegist", method=RequestMethod.POST)
    public void bookRegist(@RequestParam String bookId, @RequestParam String bookName, @RequestParam String bookAuthor, @RequestParam int price, @RequestParam String company, @RequestParam String category) {
        BookData book = new BookData();
        book.setBookNum(bookService.countBookData()+1);
        book.setBookId(bookId);
        book.setBookName(bookName);
        book.setBookAuthor(bookAuthor);
        book.setPrice(price);
        book.setCategory(category);
        book.setCompany(company);


       bookService.createBookData(book);
    }

    @RequestMapping("/bookList")
    public ModelAndView bookList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("bookList");
        List<String> lists = new ArrayList<>();
        lists.add("apple");
        lists.add("apple2");
        lists.add("apple3");

        mv.addObject("lists",lists);
        mv.addObject("message","Hello ModelandView");
        mv.addObject("list",bookService.selectBookDataList());

        return mv;
    }

}