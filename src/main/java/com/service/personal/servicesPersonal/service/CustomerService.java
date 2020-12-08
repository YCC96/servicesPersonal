package com.service.personal.servicesPersonal.service;

import java.util.List;

import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;
import com.service.personal.servicesPersonal.model.customer.response.CustomerResponse;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    List<CustomerRequest> getAllCustomers();

    CustomerResponse create(CustomerRequest customerRequest);

    CustomerResponse update(String id, CustomerRequest customerRequest);
    
    CustomerResponse delete(String id);

    CustomerRequest findById(String id);

}
