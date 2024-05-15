package com.springboot.application.demo.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

/**
 * @author Swapnil Godambe.<br>
 * Copyright 2024.
 */
@Entity
@Data
@Builder
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "creation_date", nullable = false)
    private Instant creationDate;
}
