package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("Success login again for user {}" + event.getUser());
    }


}
