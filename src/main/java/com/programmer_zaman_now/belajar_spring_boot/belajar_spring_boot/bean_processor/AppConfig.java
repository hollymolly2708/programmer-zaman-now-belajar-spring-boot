package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.bean_processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyBean myBean(){
        MyBean myBean = new MyBean();
        myBean.setMessage("Initial Message");
        return myBean;
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor(){
        return new CustomBeanPostProcessor();
    }
}
