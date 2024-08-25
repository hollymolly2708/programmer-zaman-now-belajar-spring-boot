package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Bar;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import static java.sql.DriverManager.println;

@Configuration
public class DependsOnConfiguration {
    @Bean
    @DependsOn(value = "bar")
    public Foo foo() {
        println("Create new Foo");
        return new Foo();
    }

    @Bean
    @Lazy
    public Bar bar() {
        println("Create new Bar");
        return new Bar();
    }
}
