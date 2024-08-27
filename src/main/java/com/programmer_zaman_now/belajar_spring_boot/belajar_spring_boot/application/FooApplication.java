package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.application;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Bar;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.print(foo);
    }


    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public Foo foo(Bar bar) {
        return new Foo();
    }
}
