package com.example.socialMediaApp_restAPI_practice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    public static List<User> users = new ArrayList<>();// adding static values in beginning.
    private static int userCount =0;
    static{
        users.add(new User(++userCount,"Jack", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Dorsey", LocalDate.now().minusYears(27)));
        users.add(new User(++userCount,"Miller", LocalDate.now().minusYears(32)));
    }
     public List<User> findAll(){
        return users;
    }

    public User findById(int id) {
        Predicate <? super User> predicate = (user-> user.getId().equals(id));
        return users.stream().filter(predicate).findFirst().get();
    }

    public User save(User user) {
       user.setId(++userCount);
        users.add(user);
        return user;
    }
}
