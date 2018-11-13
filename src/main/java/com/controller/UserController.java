package com.controller;


import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String login(HttpServletRequest request, User user, HttpSession session) {
        User user1 = userService.showone(user);
        if (user1 != null) {
            session.setAttribute("user", user1);
            return "redirect:/emp/showAll";
        } else {
            return "redirect:/login.jsp";
        }
    }

    @RequestMapping("regist")
    public String regist(HttpServletRequest request, User user) {
        userService.regist(user);
        return "redirect:/login.jsp";

    }
}
