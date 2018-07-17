package com.cyj.mystock.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {



    @RequestMapping(value = {"/","/index"})
    public String index(){
        return "我的Java世界Security!!!";
    }

    @RequestMapping(value="/login" )
    public String login(){
        return"login";
    }

    @RequestMapping(value="/welcome")
    @PreAuthorize("hasRole('admin')")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = {"/news"})
    @PreAuthorize("hasRole('guest')")
    public String news(){
        return "BIG news";
    }

    @RequestMapping(value = {"/myerror"})
    public String myError(){

        return "myerror page";
    }


}
