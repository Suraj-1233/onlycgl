package com.jwt.example.JwtExample.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.JwtExample.models.User;
import com.jwt.example.JwtExample.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    
// htttp://localhost:8081/home/user
  @Autowired
  private UserService userService;


 @GetMapping("/users")
 public List<User> getUser(){

    System.err.println(" gettting Users");
// return this.userService.getUsers();
 return this.userService.getUsers();
 }


 @GetMapping("/current-user")
 public String currentUser( Principal principal)
 {

    return principal.getName();
 }



}
