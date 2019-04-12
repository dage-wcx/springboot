package com.example.demo.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyException5 implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mav = new ModelAndView();
        //判断不同类型的异常，可用来做不同的异常跳转
        if(e instanceof ArithmeticException){
            mav.setViewName("error5");
        }
        if(e instanceof NullPointerException){
            mav.setViewName("error5");
        }
        mav.addObject("error",e.toString());
        return mav;
    }
}
