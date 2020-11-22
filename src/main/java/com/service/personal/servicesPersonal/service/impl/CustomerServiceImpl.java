package com.service.personal.servicesPersonal.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.service.personal.servicesPersonal.model.customer.CustomerRequest;
import com.service.personal.servicesPersonal.service.CustomerService;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    List<CustomerRequest> listCustomerRequest = new ArrayList<>();

    @Override
    public List<CustomerRequest> getAllCustomers() {
        return this.listCustomerRequest;
    }
    
}
