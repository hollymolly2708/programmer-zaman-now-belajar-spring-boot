package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service"
})
public class ComponentConfiguration {
}
