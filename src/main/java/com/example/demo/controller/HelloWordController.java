package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class HelloWordController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "login";
    }

    @RequestMapping("/first")
    public String index1(){
        System.out.println(111);
        return "login";
    }

    @RequestMapping("/showFree")
    public String freemarkerTest(Model model){
        User u1 = new User(1,"dage","123");
        User u2 = new User(2,"二哥","456");
        User u3 = new User(3,"三哥","789");

        List list = new ArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        model.addAttribute("list",list);

        return "test";
    }

    @RequestMapping("/showTh")
    public String thymeleafTest(Model model, HttpServletRequest request){
        model.addAttribute("msg","一个thymeleaf案例");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","女");

        User u1 = new User(1,"dage","123");
        User u2 = new User(2,"二哥","456");
        User u3 = new User(3,"三哥","789");


        List list = new ArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        model.addAttribute("list",list);

        Map<String,User> map = new HashMap<String,User>();
        map.put("u1",u1);
        map.put("u2",u2);
        map.put("u3",u3);

        model.addAttribute("map",map);

        request.setAttribute("req","request域对象操作");
        request.getSession().setAttribute("session","session域对象操作");
        request.getSession().getServletContext().setAttribute("context","servletContext域对象操作");


        return "thymeleafTest";
    }

    @RequestMapping("/urlTest")
    @ResponseBody
    public String urlTest(Integer id, String name){
        System.out.println(id+"，"+name);
        return "传参成功";
    }
}
