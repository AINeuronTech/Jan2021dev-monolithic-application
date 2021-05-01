package com.ecommerce.ecommerceservices.productinfo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductInfoServices {
    @RequestMapping("/product")
    public String getProduct(){
        return "iPhone";
    }

}
