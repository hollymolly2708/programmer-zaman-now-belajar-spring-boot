package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.processor;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.print("Id Generator Processor for Bean {}" + beanName );
        if (bean instanceof IdAware) {
            System.out.print("Set Id Generator for Bean{}" + "," + beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
