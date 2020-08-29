package com.dekel.zepp.msscbrewery.web.service;

import com.dekel.zepp.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName("Darko Cep")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("Update Customer...");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
