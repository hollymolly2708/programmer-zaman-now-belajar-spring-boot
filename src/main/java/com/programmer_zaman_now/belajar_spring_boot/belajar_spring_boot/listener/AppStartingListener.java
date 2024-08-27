package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class AppStartingListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.print("Application Starting");
    }
}
