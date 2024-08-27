package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {
    @EventListener(classes =  LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        System.out.println("Success login for user {}" + event.getUser());
    }  @EventListener(classes =  LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event){
        System.out.println("Success login for user {}" + event.getUser());
    }  @EventListener(classes =  LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event){
        System.out.println("Success login for user {}" + event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent4(LoginSuccessEvent event) {
        System.out.print("Success login for user {}" + event.getUser());
    }

}
