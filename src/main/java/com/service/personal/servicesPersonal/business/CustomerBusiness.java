package com.service.personal.servicesPersonal.business;

import java.util.List;

import com.service.personal.servicesPersonal.model.customer.CustomerRequest;

import org.springframework.stereotype.Service;

@Service
public interface CustomerBusiness {
    
    List<CustomerRequest> getAllCustomer();
    
}
