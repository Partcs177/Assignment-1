package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Deposit;
@Repository
public interface DepositRepository extends CrudRepository<Deposit, Integer> {

}
