package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import static java.sql.DriverManager.println;

public class Connection implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.print("Connection is closed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print("Connection is ready to be used");
    }
}
