package com.jwt.example.JwtExample.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;




import org.springframework.stereotype.Service;

import com.jwt.example.JwtExample.models.User;
 @Service
public class UserService {
     private List<User> store=new ArrayList<>();
    


      public UserService() {
          
          store.add(new User(UUID.randomUUID().toString(),"suraj","suraj@123gmail.com"));
          store.add(new User(UUID.randomUUID().toString(),"suraj1","suraj@1233gmail.com"));

          store.add(new User(UUID.randomUUID().toString(),"suraj2" ,"suraj@1234@gmail.com"));

      }
      public  List<User> getUsers(){
          return this.store;

      }

}
