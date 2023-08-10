package com.example.spring6restmvc.services;

import com.example.spring6restmvc.mappers.CustomerMapper;
import com.example.spring6restmvc.model.CustomerDTO;
import com.example.spring6restmvc.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceJPA implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public Optional<CustomerDTO> getCustomerById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDto) {
        return null;
    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDTO customerDto) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

    @Override
    public void patchCustomerById(UUID customerId, CustomerDTO customerDto) {

    }
}
