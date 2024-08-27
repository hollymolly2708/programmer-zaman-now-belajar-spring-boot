package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.application;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBootTest {
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFoo(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
