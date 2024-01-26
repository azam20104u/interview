package com.azam.java8;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee implements Serializable, Cloneable {
	private String name;
	private String department;
	private int age;
	public Address address;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		clone.address = (Address) address.clone();
		return clone;
	}
}
