package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.CategoryRepository;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.CustomerRepository;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.repository.ProductRepository;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service.CategoryService;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service.CustomerService;
import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean(ProductService.class);
        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDepedencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        Assertions.assertSame(productRepository, productService.getProductRepository());
        Assertions.assertNotNull(productService.getProductRepository());
    }

    @Test
    void testSetterDepedencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldDepedencyInjection() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);
        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }
}
