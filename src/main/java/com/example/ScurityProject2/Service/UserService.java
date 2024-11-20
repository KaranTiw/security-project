package com.example.ScurityProject2.Service;

import com.example.ScurityProject2.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    public List<User> list=new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abs","abc@gmail.com"));
        list.add(new User("xyz","xyz","xyz@gmail.com"));
    }

    public User findByUsername(String username) {
        return this.list.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
    }


    public User addUser(User user){
        this.list.add(user);
        return user;
    }

    // Get all users
    public List<User> getAllUsers(){
        return  this.list;
    }




}
