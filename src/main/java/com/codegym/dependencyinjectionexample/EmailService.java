package com.codegym.dependencyinjectionexample;

public class EmailService implements MessengerService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email Message: " + message);
    }
}
