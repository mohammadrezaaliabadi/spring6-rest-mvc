package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.CustomerDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {

    Optional<CustomerDto> getCustomerById(UUID uuid);

    List<CustomerDto> getAllCustomers();

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomerById(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);

    void patchCustomerById(UUID customerId, CustomerDto customerDto);

}
