package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sun.istack.NotNull;

@Entity
public class Withdraw {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Size(min=2, max=10)
	Integer accountNumber;
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	Double amount;
	String description;
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
