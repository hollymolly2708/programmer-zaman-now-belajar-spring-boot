package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.client;

import org.springframework.stereotype.Component;


public class PaymentGatewayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
