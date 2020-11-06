package com.freefat.mvp.freefatmvp.controller;

import com.freefat.mvp.freefatmvp.models.User;
import com.freefat.mvp.freefatmvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/freefat"})
public class UserController
{
    @Autowired
    UserService service;

    @PostMapping("/users/save")
    public User saveUser(@RequestBody User user) { return service.saveUser(user); }

    @GetMapping("/users/edit/{id}")
    public User getUserById(@PathVariable("id") String id) { return service.findUserById(id).get(); }

}
