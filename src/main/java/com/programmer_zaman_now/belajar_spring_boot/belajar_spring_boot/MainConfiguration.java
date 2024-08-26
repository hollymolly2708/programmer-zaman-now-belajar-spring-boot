package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.configuration.BarConfiguration;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FooConfiguration.class, BarConfiguration.class})
public class MainConfiguration {
}
