package com.example.javatechnicaltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class JavaTechnicalTestApplication {


    public static void main(String[] args) {
        SpringApplication.run(JavaTechnicalTestApplication.class, args);
    }

    private void insertCustomers(CustomerRepository repository) {
        repository.save(new Customer("Moaz", "Nasr", LocalDate.of(1996,9,02)));
        repository.save(new Customer("Ahmed", "Nasr", LocalDate.of(1976,8,31)));
        repository.save(new Customer("John", "Doe", LocalDate.of(1982,7,03)));
        repository.save(new Customer("Jane", "Doe", LocalDate.of(2001,1,01)));
    }

    private void insertAccounts(AccountRepository repository) {
    }

}
