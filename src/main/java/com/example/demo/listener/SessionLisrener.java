package com.example.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionLisrener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("SessionLisrener->监听器初始化");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("SessionLisrener->监听器销毁");
    }

}
