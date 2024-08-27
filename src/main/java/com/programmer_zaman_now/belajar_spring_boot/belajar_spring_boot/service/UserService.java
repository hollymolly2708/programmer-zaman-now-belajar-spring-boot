package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.User;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.event.LoginSuccessEvent;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener.LoginSuccessListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "fiqri".equals(username) && "fiqri".equals(password);
    }
}
