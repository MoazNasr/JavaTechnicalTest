package com.example.javatechnicaltest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    @Column(name = "accountId", nullable = false)
    private Long accountId;
    @ManyToOne
    private Customer customer;
    private Integer accountNumber;

    public Account(Customer customer, Integer accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
    }


    public Account() {

    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customer=" + customer +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
