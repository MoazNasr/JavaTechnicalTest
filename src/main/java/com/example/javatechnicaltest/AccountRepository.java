package com.example.javatechnicaltest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findAccountsByCustomer_CustomerId(Long customerId);
}
