package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/exception")*/
public class ExceptionController {

    @RequestMapping("/test1")
    public String test1(){
        String str = null;
        str.length();
        return "addUserinfo";
    }

    @RequestMapping("/test2")
    public String test2(){
        int i = 10/0;
        return "addUserinfo";
    }

    /*@ExceptionHandler(value = {java.lang.ArithmeticException.class,java.lang.NullPointerException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("error",e.toString());
        mav.setViewName("error1");
        return mav;
    }*/
}
