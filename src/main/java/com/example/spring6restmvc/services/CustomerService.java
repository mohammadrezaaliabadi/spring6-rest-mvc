package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.CustomerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {

    Optional<CustomerDTO> getCustomerById(UUID uuid);

    List<CustomerDTO> getAllCustomers();

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);

    Optional<CustomerDTO> updateCustomerById(UUID customerId, CustomerDTO customerDto);

    Boolean deleteCustomerById(UUID customerId);

    Optional<CustomerDTO> patchCustomerById(UUID customerId, CustomerDTO customerDto);

}
