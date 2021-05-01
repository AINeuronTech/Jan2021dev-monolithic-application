package com.ecommerce.ecommerceservices.reviewdata.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReview {
    @RequestMapping("/review")
    public String getReviews(){
        return "iPhone 12 is great";
    }
}
