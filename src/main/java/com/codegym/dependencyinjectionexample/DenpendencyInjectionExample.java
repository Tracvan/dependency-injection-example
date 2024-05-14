package com.codegym.dependencyinjectionexample;

public class DenpendencyInjectionExample {
    public static void main(String[] args){
        MessengerService messengerService = new EmailService();
        UserController userController = new UserController(messengerService);
        userController.send();
    }
}
