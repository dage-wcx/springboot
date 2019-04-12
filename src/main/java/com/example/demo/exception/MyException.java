package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException {

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("error","除数不能为0");
        mav.setViewName("error1");
        return mav;
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("error","数据为空");
        mav.setViewName("error1");
        return mav;
    }
}
