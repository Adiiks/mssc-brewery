package pl.adiks.msscbrewery.mappers;

import org.mapstruct.Mapper;
import pl.adiks.msscbrewery.domain.Customer;
import pl.adiks.msscbrewery.dto.CustomerDTO;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
