package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.factory;

import com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPrivateKey("private");
        client.setPublicKey("public");
        return client;

    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }

}
