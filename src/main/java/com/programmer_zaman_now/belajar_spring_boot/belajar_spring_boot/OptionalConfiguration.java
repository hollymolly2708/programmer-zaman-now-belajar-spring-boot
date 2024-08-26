package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Bar;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.Foo;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }

}
