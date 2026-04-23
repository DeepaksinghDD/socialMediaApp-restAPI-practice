package com.example.socialMediaApp_restAPI_practice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;
    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUser(){
            return service.findAll();
    }
    @GetMapping("/users/{id}" )
    public User retrieveById(@PathVariable int id){

        User user = service.findById(id);
        if (user == null){
            throw new UserNotFoundException("id :"+id);
        }
        return user;
    }
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }
}