package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

}
