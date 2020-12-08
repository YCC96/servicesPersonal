package com.service.personal.servicesPersonal.model.customer.response;

import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;

public class CustomerResponse {

    private String message;

    private String id;

    private CustomerRequest customerRequest;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomerRequest getCustomerRequest() {
        return customerRequest;
    }

    public void setCustomerRequest(CustomerRequest customerRequest) {
        this.customerRequest = customerRequest;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "message='" + message + '\'' +
                "id='" + id + '\'' +
                "customerRequest='" + customerRequest + '\'' +
                '}';
    }
    
}
