package com.example.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledDemo {

    @Scheduled(cron = "0/5 * * * * ?")
    public void scheduledTest1(){
        System.out.println("定时器触发"+new Date());
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void scheduledTest2(){
        System.out.println("跑");
    }
}
