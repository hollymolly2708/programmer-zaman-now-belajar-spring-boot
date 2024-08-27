package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.event;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.User;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
