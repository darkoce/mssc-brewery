package com.dekel.zepp.msscbrewery.web.service;

import com.dekel.zepp.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
