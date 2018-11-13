package com.controller;

import com.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("showAll")
    public String showAll() {
        deptService.queryAll();
        return "redirect:/deptlist.jsp";
    }
}
