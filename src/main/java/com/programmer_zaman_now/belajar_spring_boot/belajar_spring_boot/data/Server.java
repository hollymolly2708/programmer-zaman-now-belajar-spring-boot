package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Server {
    @PostConstruct
    public void start(){
        System.out.print("Start server");
    }
    @PreDestroy
    public void stop(){
        System.out.print("Stop server");
    }
}
