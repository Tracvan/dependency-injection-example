package com.codegym.dependencyinjectionexample;

public class SmsService implements MessengerService{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Message: " + message);
    }
}
