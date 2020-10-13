package pl.adiks.msscbrewery.service;

import pl.adiks.msscbrewery.dto.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}
