package com.learniing.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("users")
public class UserController {
    
    @GetMapping("hello")
    public String sayHello() {
        return "Hello Word";
    }

    @PostMapping("")
    public String create(@RequestBody User entity) {

        System.out.println(entity.toString());
        return entity.toString();
    }

    @GetMapping("{user-id}")
    public String getMethodName(@PathVariable("user-id") String userId) {
        return userId;
    }
    
    
}
