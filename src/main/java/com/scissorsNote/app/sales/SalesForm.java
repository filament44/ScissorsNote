package com.scissorsNote.app.sales;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class SalesForm {
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate date;
	
	private String name;
	
	private String gender;
	
	@NotNull
	private String age;
	
	private int price;
	
	public SalesForm() {}
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
