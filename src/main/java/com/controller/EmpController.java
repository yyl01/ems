package com.controller;

import com.entity.Employee;
import com.service.EmpService;
import com.vo.pageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;

    @RequestMapping("/showAll")
    public String showAll(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println("dd");
        empService.showAll();
        session.setAttribute("emps", empService.showAll());
        return "redirect:/emplist.jsp";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        empService.delete(id);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("/update")
    public String update(Employee employee) {
        System.out.println(employee);
        empService.update(employee);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("/add")
    public String add(Employee employee) {
        empService.insert(employee);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("/fy")
    public String fy(pageBean pagebean, HttpServletRequest request) {
        empService.findb(pagebean);
        empService.find();
        pagebean.setTotalcount(empService.find());
        HttpSession session = request.getSession();
        session.setAttribute("emps", empService.findb(pagebean));
        return "redirect:/emplist.jsp";
    }
}
