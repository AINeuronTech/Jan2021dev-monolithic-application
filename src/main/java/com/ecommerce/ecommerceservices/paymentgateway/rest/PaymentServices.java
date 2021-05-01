package com.ecommerce.ecommerceservices.paymentgateway.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServices {
    @RequestMapping("/payment")
    public String processPayment(){
        return "payment process complete";
    }
}
