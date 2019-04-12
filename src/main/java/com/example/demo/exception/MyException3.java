package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException3 {

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("error",e.toString());
        mav.setViewName("error3");
        return mav;
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("error",e.toString());
        mav.setViewName("error3");
        return mav;
    }


}
