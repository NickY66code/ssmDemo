package com.noah.controller;

import com.noah.dao.UserDao;
import com.noah.domain.user;
import com.noah.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    userService userService;

    @Autowired
    UserDao userdao;

    @RequestMapping("/login")
    public String loginMethod(user users, Model model, HttpSession session){
        System.out.println("controller:login");


        if(userService.SelectUser(users))
        {
            session.setAttribute("username",users.getUsername());
            users=userdao.findUser(users.getUsername());
            session.setAttribute("id",users.getId());
            return "main";
        }else {
            return "errors";
        }

    }

    @RequestMapping("/myself")
    public String myselfMethod(user users,HttpSession session,Model model){
        users.setUsername((String)session.getAttribute("username"));
        List<user> list=userService.findUser(users);
        model.addAttribute("list",list);
        for(user findUser:list){
            System.out.println(list);
        }
        //model.addAttribute("id",users.getId());
        return "myself";
    }


    @RequestMapping("/addUser")
    public String AddUser(){
        return "addusers";
    }

    @RequestMapping("/updateSucc")
    public String updateSuccMethod(user users,HttpSession session){

        users.setId((Integer)session.getAttribute("id"));
        System.out.println(users);
        userdao.UpdateUserMess(users);
        session.setAttribute("id",users.getId());
        session.setAttribute("username",users.getUsername());
        return "updateSuccess";
    }
//    @RequestMapping("success")
//    public String ssad(){
//        return "success";
//    }

}
