package com.example.spring.batch.repository;

import com.example.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select count(c) from Customer c")
    long getCustomerCount();
}
