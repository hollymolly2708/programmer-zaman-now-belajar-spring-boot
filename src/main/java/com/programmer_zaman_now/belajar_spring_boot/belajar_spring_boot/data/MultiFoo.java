package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultiFoo {
    private List<Foo> foos;

    public List<Foo> getFoos() {
        return foos;
    }

    public MultiFoo(ObjectProvider<Foo> objectProvider){
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}
