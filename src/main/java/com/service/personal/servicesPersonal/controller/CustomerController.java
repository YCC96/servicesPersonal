package com.service.personal.servicesPersonal.controller;

import org.springframework.web.bind.annotation.*;

import com.service.personal.servicesPersonal.business.CustomerBusiness;
import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;
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

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<ResponseServicesPersonalApi> getAll() {
        ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
                messageSource.getMessage("response.customer.list.code", null, LocaleContextHolder.getLocale()),
                messageSource.getMessage("response.customer.list.msg", null, LocaleContextHolder.getLocale()),
                customerBusiness.getAllCustomer());

        return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.CREATED);
    }

    @GetMapping("/findId/{id}")
    @ResponseBody
    public ResponseEntity<ResponseServicesPersonalApi> findById(@PathVariable String id) {
        ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
                messageSource.getMessage("response.customer.find.code", null, LocaleContextHolder.getLocale()),
                messageSource.getMessage("response.customer.find.msg", null, LocaleContextHolder.getLocale()),
                customerBusiness.findByIdCustomer(id));

        return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseServicesPersonalApi> createCustomer(@RequestBody CustomerRequest customerRequest){
    	ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
    			messageSource.getMessage("response.customer.add.code", null, LocaleContextHolder.getLocale()),
                messageSource.getMessage("response.customer.add.msg", null, LocaleContextHolder.getLocale()),
    			customerBusiness.createCustomer(customerRequest)
    		);
    	
    	return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseServicesPersonalApi> updateCustomer(@PathVariable String id, @RequestBody CustomerRequest customerRequest){
    	ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
    			messageSource.getMessage("response.customer.update.code", null, LocaleContextHolder.getLocale()),
                messageSource.getMessage("response.customer.update.msg", null, LocaleContextHolder.getLocale()),
    			customerBusiness.updateCustomer(id, customerRequest)
    		);
    	
    	return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseServicesPersonalApi> deleteCustomer(@PathVariable String id){
    	ResponseServicesPersonalApi responseServicesPersonalApi = new ResponseServicesPersonalApi(
    			messageSource.getMessage("response.customer.delete.code", null, LocaleContextHolder.getLocale()),
                messageSource.getMessage("response.customer.delete.msg", null, LocaleContextHolder.getLocale()),
    			customerBusiness.deleteCustomer(id)
    		);
    	
    	return new ResponseEntity<>(responseServicesPersonalApi, HttpStatus.OK);
    }

}
