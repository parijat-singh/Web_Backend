package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.repository.CustomerRepository;
import com.simplilearn.workshop.repository.InMemoryCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

    // depends on customer repository
    private CustomerRepository customerRepository = new InMemoryCustomerRepositoryImpl();
    @Override
    public List<Customer> retrieveAllCustomers() {
        return customerRepository.findAll();
    }

}