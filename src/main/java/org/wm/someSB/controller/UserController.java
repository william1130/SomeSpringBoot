package org.wm.someSB.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {

        return "Hello " + name;
    }


}
