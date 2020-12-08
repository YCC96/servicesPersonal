package com.service.personal.servicesPersonal.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.service.personal.servicesPersonal.model.customer.request.CustomerRequest;
import com.service.personal.servicesPersonal.model.customer.response.CustomerResponse;
import com.service.personal.servicesPersonal.service.CustomerService;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    List<CustomerRequest> listCustomerRequest = new ArrayList<>();

    Integer cont = 1;
    
    CustomerServiceImpl(){
        CustomerRequest customerRequest = new CustomerRequest();
        customerRequest.setId("1");
        customerRequest.setName("Yori");
        customerRequest.setFirstSurname("Cruz");
        customerRequest.setLastSurname("Cruz");
        customerRequest.setAge("23");
        customerRequest.setGender("Maculino");
        customerRequest.setMail("yordy.cruz_96@outlook.es");
        customerRequest.setTelephone("5611820006");
        customerRequest.setUpdateDate("hoy");
        this.listCustomerRequest.add(customerRequest);
    }

    @Override
    public List<CustomerRequest> getAllCustomers() {
        return this.listCustomerRequest;
    }

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        CustomerResponse customerResponse = new CustomerResponse();
        this.cont++;
        customerRequest.setId(cont + "");
        this.listCustomerRequest.add(customerRequest);
        customerResponse.setId(cont + "");
        customerResponse.setMessage("");
        return customerResponse;
    }

    @Override
    public CustomerResponse update(String id, CustomerRequest customerRequest) {
        CustomerResponse customerResponse = new CustomerResponse();
        this.listCustomerRequest.forEach(li -> {
            if(li.getId().equals(id)){
                li.setName(customerRequest.getName());
                li.setFirstSurname(customerRequest.getFirstSurname());
                li.setLastSurname(customerRequest.getLastSurname());
                li.setAge(customerRequest.getAge());
                li.setGender(customerRequest.getGender());
                li.setMail(customerRequest.getMail());
                li.setTelephone(customerRequest.getTelephone());
                li.setUpdateDate(customerRequest.getUpdateDate());
            }
        });
        customerResponse.setId(id);
        customerResponse.setMessage("Se actualizo con exito");
        return customerResponse;
    }

    @Override
    public CustomerResponse delete(String id) {
        CustomerResponse customerResponse = new CustomerResponse();
        for (int i = 0; i < this.listCustomerRequest.size(); i++) {
            if(this.listCustomerRequest.get(i).getId().equals(id)){
                this.listCustomerRequest.remove(i);
            }
        }

        customerResponse.setId(id);
        customerResponse.setMessage("Se elimino con exito");
        return customerResponse;
    }

    @Override
    public CustomerRequest findById(String id) {
        CustomerRequest customerRequest = new CustomerRequest();
        this.listCustomerRequest.forEach(li -> {
            if(li.getId().equals(id)){
                customerRequest.setId(li.getId());
                customerRequest.setName(li.getName());
                customerRequest.setFirstSurname(li.getFirstSurname());
                customerRequest.setLastSurname(li.getLastSurname());
                customerRequest.setAge(li.getAge());
                customerRequest.setGender(li.getGender());
                customerRequest.setMail(li.getMail());
                customerRequest.setTelephone(li.getTelephone());
                customerRequest.setUpdateDate(li.getUpdateDate());
            }
        });
        return customerRequest;
    }
    
}
