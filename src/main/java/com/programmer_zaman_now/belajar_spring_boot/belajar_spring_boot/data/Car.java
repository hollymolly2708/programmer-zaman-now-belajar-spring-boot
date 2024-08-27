package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.aware.IdAware;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
