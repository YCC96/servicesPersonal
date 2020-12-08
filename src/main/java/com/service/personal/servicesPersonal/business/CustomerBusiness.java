package com.service.personal.servicesPersonal.business;

import java.util.List;

import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;
import com.service.personal.servicesPersonal.model.customer.response.CustomerResponse;

import org.springframework.stereotype.Service;

@Service
public interface CustomerBusiness {
    
    List<CustomerRequest> getAllCustomer();

    CustomerResponse createCustomer(CustomerRequest customerRequest);

    CustomerResponse updateCustomer(String id, CustomerRequest customerRequest);

    CustomerResponse deleteCustomer(String id);

    CustomerResponse findByIdCustomer(String id);
    
}
