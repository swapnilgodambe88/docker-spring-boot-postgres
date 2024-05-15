package com.springboot.application.demo.controllers;

import com.springboot.application.demo.entities.Customer;
import com.springboot.application.demo.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

/**
 * @author Swapnil Godambe.<br>
 * Copyright 2024.
 */
@Slf4j
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(path = "/get-all", produces = "application/json")
    public ResponseEntity<List<Customer>> getAllEmployees() {
        Customer newCustomer = Customer.builder()
                .firstName("John")
                .lastName("Doe")
                .creationDate(Instant.now())
                .build();

        log.info("Saving new customer...");
        repository.saveAndFlush(newCustomer);


        final List<Customer> customers = repository.findAll();

        return ResponseEntity.ok().body(customers);
    }
}
