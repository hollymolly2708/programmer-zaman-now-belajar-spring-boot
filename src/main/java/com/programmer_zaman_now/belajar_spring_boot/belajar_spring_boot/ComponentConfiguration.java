package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service",
        "com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository",
        "com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.configuration",

})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
