package com.service.personal.servicesPersonal.business.impl;

import java.util.List;

import com.service.personal.servicesPersonal.business.CustomerBusiness;
import com.service.personal.servicesPersonal.model.customer.CustomerRequest;
import com.service.personal.servicesPersonal.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerBusinessImpl implements CustomerBusiness {

    @Autowired
    private CustomerService customerService;

    @Override
    public List<CustomerRequest> getAllCustomer() {
        return customerService.getAllCustomers();
    }
    
}
