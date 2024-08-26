package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
