package com.example.socialMediaApp_restAPI_practice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    public static List<User> users = new ArrayList<>();// adding static values in beginning.

    static{
        users.add(new User(1,"Jack", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Dorsey", LocalDate.now().minusYears(27)));
        users.add(new User(3,"Miller", LocalDate.now().minusYears(32)));
    }
     public List<User> findAll(){
        return users;
    }



}
