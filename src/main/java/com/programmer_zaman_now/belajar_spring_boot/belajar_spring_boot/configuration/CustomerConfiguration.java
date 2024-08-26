package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.configuration;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {
    @Bean
    @Primary
    public CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
}
