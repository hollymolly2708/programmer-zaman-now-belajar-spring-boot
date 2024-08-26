package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FooConfiguration.class, BarConfiguration.class})
public class MainConfiguration {
}
