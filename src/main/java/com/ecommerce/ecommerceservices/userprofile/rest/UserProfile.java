package com.ecommerce.ecommerceservices.userprofile.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfile {
    @RequestMapping("/person")
    public String getPerson(){
        return "Jon Doe";
    }
}
