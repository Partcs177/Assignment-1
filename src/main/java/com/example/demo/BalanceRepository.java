package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BalanceEnquiry;

@Repository
public interface BalanceRepository extends CrudRepository<BalanceEnquiry, Integer> {

}
