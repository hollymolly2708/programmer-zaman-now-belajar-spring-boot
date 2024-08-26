package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.configuration;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
