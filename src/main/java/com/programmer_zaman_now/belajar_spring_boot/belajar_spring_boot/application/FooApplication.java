package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.application;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Bar;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {
    /*    public static void main(String[] args) {
            ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class);
            Foo foo = applicationContext.getBean(Foo.class);
            System.out.print(foo);
        }*/
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));
        ConfigurableApplicationContext applicationContext = application.run(args);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public Foo foo(Bar bar) {
        return new Foo();
    }
}
