package com.cegedim.docMngSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String index() {
        return "/fileUpload";
    }

    @RequestMapping("/home")
    public String home() {
        return "/fileUpload";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "/fileUpload";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

//
//    @RequestMapping(value="/login", method = RequestMethod.GET)
//    public String showLoginPage(ModelMap model){
//        return "login";
//    }

//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
//
//        model.put("name", name);
//
//        model.put("password", password);
//
//        return "welcome";
//
//    }
}
