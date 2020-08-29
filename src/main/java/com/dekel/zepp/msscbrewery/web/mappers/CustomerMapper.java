package com.dekel.zepp.msscbrewery.web.mappers;

import com.dekel.zepp.msscbrewery.domain.Customer;
import com.dekel.zepp.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer CustomerDtoToCustomer(CustomerDto dto);

}
