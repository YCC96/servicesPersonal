package com.service.personal.servicesPersonal.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {

    @GetMapping("/all")
    @ResponseBody
    public String getAll() {
    	return "Hello World 3!";
    }
    
}
