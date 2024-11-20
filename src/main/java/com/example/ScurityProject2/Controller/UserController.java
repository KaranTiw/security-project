package com.example.ScurityProject2.Controller;

import com.example.ScurityProject2.Models.User;
import com.example.ScurityProject2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;




    @GetMapping("/")
    public List<User> getAllUsers() {

        return this.userService.getAllUsers();
    }


    //Single User

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.findByUsername(username);
    }

    @PostMapping
    public User add(@RequestBody User user){

        return this.userService.addUser(user);
    }





}
