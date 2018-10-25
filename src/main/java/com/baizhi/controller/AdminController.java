package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by admin on 2018/10/23.
 */
@Controller

public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(Admin admin, String enCode, HttpSession session){

        String kaptcha = (String) session.getAttribute("vrifyCode");
        System.out.println(kaptcha+"验证码=======================");
        if(kaptcha.equals(enCode)){
            Admin admin1 = adminService.login(admin);
            System.out.println(admin1+"'========================");
            if(admin1!=null){
                session.setAttribute("admin1",admin1);
                return "redirect:/main/main.jsp";
            }
        }

        return "login";


    }

    @RequestMapping("/test")
    public String test(Admin admin){
        return "index";
    }
}
