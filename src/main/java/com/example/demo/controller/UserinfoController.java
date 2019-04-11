package com.example.demo.controller;

import com.example.demo.entity.Userinfo;
import com.example.demo.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserinfoController {

    @Autowired
    private IUserinfoService userinfoServiceImpl;

    @RequestMapping("/insert")
    public String tt(Userinfo userinfo){
        int i = 1/0;
        return "addUserinfo";
    }

    @RequestMapping("/update")
    public String update(Userinfo userinfo, Model model){
        System.out.println(userinfo);
        model.addAttribute("user",userinfo);
        return "/updateUserinfo";
    }

    @RequestMapping("/addUserinfo")
    public String addUserinfo(@Valid Userinfo userinfo, BindingResult result){
        boolean flag = userinfoServiceImpl.addUserinfo(userinfo);
        if(result.hasErrors()){
            return "addUserinfo";
        }
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
