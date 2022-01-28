package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;



@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@NotBlank
	@NotEmpty
	@Length(min=3, max=25)
	@Pattern(regexp = "^[a-z\sA-Z]")
	private String custName;
	@NotBlank
	private String custGender;
	@NotBlank
	private String custAddress;
	@NotBlank
	private String custCity;
	@NotBlank
	private String custState;
	@NotBlank
	private Integer pin;
	@NotBlank
	private Integer telphoneNumber;
	@Email
	@NotEmpty
	private String custEmail;
	
	public String getCustEmail() {
		return custEmail;//
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustState() {
		return custState;
	}
	public void setCustState(String custState) {
		this.custState = custState;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public Integer getTelphoneNumber() {
		return telphoneNumber;
	}
	public void setTelphoneNumber(Integer telphoneNumber) {
		this.telphoneNumber = telphoneNumber;
	}
}
