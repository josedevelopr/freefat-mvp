package com.freefat.mvp.freefatmvp.controller;

import com.freefat.mvp.freefatmvp.models.User;
import com.freefat.mvp.freefatmvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/freefat/users"})
public class UserController
{   @Autowired
    UserService service;

    @PostMapping("/signup")
    public User saveUser(@RequestBody User user) { return service.saveUser(user); }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable("id") String id) { return service.findUserById(id).get(); }

    @PostMapping("/signin")
    public ResponseEntity<User> signInUser(@RequestBody User user)
    {   Optional<User> userToSignIn = service.signInUser(user);
        if(userToSignIn.isPresent())
        {   return ResponseEntity.ok().body(userToSignIn.get());
        } else
        {   return ResponseEntity.notFound().build();
        }
    }
}