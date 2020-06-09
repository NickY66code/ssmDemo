package com.noah.controller;

import com.noah.dao.UserDao;
import com.noah.domain.user;
import com.noah.service.impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    userServiceImpl userService;

    @RequestMapping("/main")
    public String MainMethod(){
        return "main";
    }

}
