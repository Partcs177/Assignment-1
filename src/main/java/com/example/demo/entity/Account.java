package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sun.istack.NotNull;


@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Size(min=2, max=10)
	Integer custId;
	String typeOfAccount;
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@NotBlank
	@Min(500)
	Integer initialDeposit;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public Integer getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(Integer initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	
}
