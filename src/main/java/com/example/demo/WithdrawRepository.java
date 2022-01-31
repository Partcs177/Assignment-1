package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Withdraw;

@Repository
public interface WithdrawRepository extends CrudRepository<Withdraw , Integer> {

}
