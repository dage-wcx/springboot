package com.example.demo.controller;

import com.example.demo.entity.Userinfo;
import com.example.demo.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserinfoController {

    @Autowired
    private IUserinfoService userinfoServiceImpl;

    @RequestMapping("/insert")
    public String tt(){
        return "addUserinfo";
    }

    @RequestMapping("/update")
    public String update(Userinfo userinfo, Model model){
        System.out.println(userinfo);
        model.addAttribute("user",userinfo);
        return "/updateUserinfo";
    }

    @RequestMapping("/addUserinfo")
    public String addUserinfo(Userinfo userinfo){
        boolean flag = userinfoServiceImpl.addUserinfo(userinfo);
        if(flag){
            return "redirect:/showUser";
        }
        return "redirect:/error";
    }

    @RequestMapping("/showUser")
    public String showUserinfo(Model model){
        List<Userinfo> list = userinfoServiceImpl.queryAllUserinfo();
        model.addAttribute("list",list);
        return "/showUserinfo";
    }

    @RequestMapping("/deleteUserinfoById")
    public String deleteUserinfoById(Integer id){
        boolean flag = userinfoServiceImpl.deleteUserinfo(id);
        if(flag){
            return "redirect:/showUser";
        }
        return "error";
    }

    @RequestMapping("/updateUserinfoById")
    public String updateUserinfoById(Userinfo userinfo){
        System.out.println("更新用户"+userinfo);
        boolean flag = userinfoServiceImpl.updateUserinfoById(userinfo);
        if(flag){
            return "redirect:/showUser";
        }
        return "redirect:/error";
    }

}
