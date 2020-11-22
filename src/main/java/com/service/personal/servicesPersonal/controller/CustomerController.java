package com.service.personal.servicesPersonal.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.service.personal.servicesPersonal.business.CustomerBusiness;
import com.service.personal.servicesPersonal.model.customer.CustomerRequest;
import com.service.personal.servicesPersonal.model.dto.ResponseServicesPersonalApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private CustomerBusiness customerBusiness;

    @GetMapping("/hi")
    @ResponseBody
    public String getHi() {
    	return "Hello World 3!";
    }

    /**
     * 
     * @return
     @GetMapping("/all")
     @ResponseBody
     public ResponseEntity<ResponseServicesPersonalApi> getAll() {
         ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
                 messageSource.getMessage("response.customer.list.code", null, LocaleContextHolder.getLocale()),
                 messageSource.getMessage("response.customer.list.msg", null, LocaleContextHolder.getLocale()),
                 customerBusiness.getAllCustomer());
 
         return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.CREATED);
     }
     */

    @GetMapping("/all")
    @ResponseBody
    public List<CustomerRequest> getAll() {

        return customerBusiness.getAllCustomer();
    }
    
}
