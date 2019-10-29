package com.signin.controller;

import com.signin.data.BookData;
import com.signin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.signin.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/signup")
    public String singup() {
        return "signup";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/bookRegist")
    public String bookResist() {
        return "bookRegist";
    }

   /*@RequestMapping("/bookList")
    public String  bookList() {
        return "bookList";
    }*/
}