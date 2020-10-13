package pl.adiks.msscbrewery.service;

import pl.adiks.msscbrewery.dto.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO, UUID customerId);

    void deleteCustomerById(UUID customerId);
}
