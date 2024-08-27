package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.bean_processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = (MyBean) context.getBean(MyBean.class);
        System.out.println("Final Message: " + myBean.getMessage());
    }
}
