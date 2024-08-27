package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener.LoginAgainSuccessListener;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener.LoginSuccessListener;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener.UserListener;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
    @Configuration
    @Import({UserService.class, LoginSuccessListener.class, LoginAgainSuccessListener.class, UserListener.class})
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("fiqri", "fiqri");
        userService.login("fiqri", "salah");
        userService.login("turham", "turham");
    }
}
