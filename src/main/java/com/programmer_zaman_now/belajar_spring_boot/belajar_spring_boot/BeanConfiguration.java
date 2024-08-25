package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        return foo;
    }


}
