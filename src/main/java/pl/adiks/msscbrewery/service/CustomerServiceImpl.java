package pl.adiks.msscbrewery.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.adiks.msscbrewery.dto.CustomerDTO;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {

        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Adrian")
                .build();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO, UUID customerId) {
        log.debug("Updating...");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer...");
    }
}
