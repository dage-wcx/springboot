package com.example.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("RequestListener->监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("RequestListener->监听器初始化");
    }
}
