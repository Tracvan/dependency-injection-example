package com.codegym.dependencyinjectionexample;

public class UserController {
   private MessengerService messengerService;
   public UserController(MessengerService messengerService){
       this.messengerService = messengerService;
   }
   public void send(){
       messengerService.sendMessage("Hello Dependency Injection pattern");
   }

}
