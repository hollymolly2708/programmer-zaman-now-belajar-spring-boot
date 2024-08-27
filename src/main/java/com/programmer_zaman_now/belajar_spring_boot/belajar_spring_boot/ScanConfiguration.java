package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.cyclic.CyclicA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages =  {
        "com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data",
})

public class ScanConfiguration {

}
