package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class DependsOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
    @Test
    void testDependsOn(){

    }
}
