package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.application;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.application.FooApplication;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
    @Autowired
    Foo foo;

    @Test
    void testSpringBoot(){
        Assertions.assertNotNull(foo);
    }
}
