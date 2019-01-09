package org.wm.someSB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wm.someSB.model.SysUser;
import org.wm.someSB.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {

        return "Hello " + name;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    @CachePut(cacheNames = "sysUser", key = "#user.id")
    public ResponseEntity register(@RequestBody SysUser user){
        return userService.register(user);
    }

    @RequestMapping(value = "/getId/{id}", method = RequestMethod.GET)
//    @Authorization
    @ResponseBody
    @Cacheable(cacheNames = "sysUser" , key = "#id")
    public String getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

}
