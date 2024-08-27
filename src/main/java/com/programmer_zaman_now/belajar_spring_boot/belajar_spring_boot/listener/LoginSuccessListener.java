package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("Success login for user {}" + event.getUser());
    }


}
