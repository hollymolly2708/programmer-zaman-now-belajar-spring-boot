package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;


    public CustomerRepository getNormalCustomerRepository() {
        return normalCustomerRepository;
    }

    public void setNormalCustomerRepository(CustomerRepository customerRepository) {
        this.normalCustomerRepository = customerRepository;
    }

    public CustomerRepository getPremiumCustomerRepository() {
        return premiumCustomerRepository;
    }

    public void setPremiumCustomerRepository(CustomerRepository premiumCustomerRepository) {
        this.premiumCustomerRepository = premiumCustomerRepository;
    }
}
