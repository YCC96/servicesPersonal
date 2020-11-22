package com.service.personal.servicesPersonal.service;

import java.util.List;

import com.service.personal.servicesPersonal.model.customer.CustomerRequest;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    List<CustomerRequest> getAllCustomers();
    
}
