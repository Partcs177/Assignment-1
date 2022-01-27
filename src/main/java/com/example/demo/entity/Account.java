package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sun.istack.NotNull;


@Entity
public class Account {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Size(min=2, max=10)
	Integer accountNo;
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@NotBlank
	Integer amount;
	String description;
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
