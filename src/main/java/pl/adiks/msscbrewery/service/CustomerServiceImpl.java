package pl.adiks.msscbrewery.service;

import org.springframework.stereotype.Service;
import pl.adiks.msscbrewery.dto.CustomerDTO;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {

        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Adrian")
                .build();
    }
}
