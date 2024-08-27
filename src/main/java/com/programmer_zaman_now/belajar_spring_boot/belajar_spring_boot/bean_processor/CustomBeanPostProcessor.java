package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.bean_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor  implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  MyBean){
            MyBean myBean = (MyBean) bean;
            System.out.println("Before initialization : " +myBean.getMessage());
            myBean.setMessage("Modified Before Initialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  MyBean){
            MyBean myBean = (MyBean) bean;
            System.out.println("After Initialization : " + myBean.getMessage());
            myBean.setMessage("Modified After Initialization");
        }
        return bean;
    }
}
