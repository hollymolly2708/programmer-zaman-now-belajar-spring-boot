package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar() {
        return new Bar();
    }

}
