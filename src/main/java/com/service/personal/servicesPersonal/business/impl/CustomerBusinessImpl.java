package com.service.personal.servicesPersonal.business.impl;

import java.util.List;

import com.service.personal.servicesPersonal.business.CustomerBusiness;
import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;
import com.service.personal.servicesPersonal.model.customer.response.CustomerResponse;
import com.service.personal.servicesPersonal.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerBusinessImpl implements CustomerBusiness {

    static final String TEXT1 =  "No se encontro usuario";

    static final String TEXT2 =  "Se encontro usuario";

    @Autowired
    private CustomerService customerService;

    @Override
    public List<CustomerRequest> getAllCustomer() {
        return customerService.getAllCustomers();
    }

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        return customerService.create(customerRequest);
    }

    @Override
    public CustomerResponse updateCustomer(String id, CustomerRequest customerRequest) {
        CustomerResponse customerResponse = new CustomerResponse();
        CustomerResponse cust = this.findByIdCustomer(id);
        if (cust.getId().equals("1")) {
            customerResponse.setMessage(TEXT1);
        } else {
            customerResponse = customerService.update(id, customerRequest);
        }
        return customerResponse;
    }

    @Override
    public CustomerResponse deleteCustomer(String id) {
        CustomerResponse customerResponse = new CustomerResponse();
        CustomerResponse cust = this.findByIdCustomer(id);
        if (cust.getId().equals("1")) {
            customerResponse.setMessage(TEXT1);
        } else {
            customerResponse = customerService.delete(id);
        }
        return customerResponse;
    }

    @Override
    public CustomerResponse findByIdCustomer(String id) {
        CustomerResponse customerResponse = new CustomerResponse();
        CustomerRequest cust = customerService.findById(id);
        if (cust.getId() == null) {
            customerResponse.setId("1");
            customerResponse.setMessage(TEXT1);
        } else {
            customerResponse.setId("0");
            customerResponse.setMessage(TEXT2);
            customerResponse.setCustomerRequest(cust);
        }
        return customerResponse;
    }
    
}
