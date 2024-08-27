package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.processor;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.print("Prefix Id Generator Processor for Bean {}" + beanName);
        if (bean instanceof IdAware) {
            System.out.print("Prefix Set Id Generator for Bean{}" + "," + beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-" + idAware.getId());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
