package com.springboot.application.demo;

import com.springboot.application.demo.entities.Customer;
import com.springboot.application.demo.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Slf4j
@SpringBootApplication
//@EnableJpaRepositories
//@EnableAutoConfiguration
//@EntityScan("com.springboot.application.demo.entities")
public class DockerSpringBootPostgresApplication {


	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootPostgresApplication.class, args);
	}
}
