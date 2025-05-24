package com.rizwan.customer.controller;

import com.rizwan.customer.dto.CustomerRegisterRequest;
import com.rizwan.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegisterRequest customerRegisterRequest) {
        log.info("New Customer Registration {}", customerRegisterRequest);
        customerService.registerCustomer(customerRegisterRequest);
    }
}
