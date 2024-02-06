package com.azam.java8;

public class CloningDemo {
	public static void main(String[] args) {
		Employee employee = new Employee("Azam", "IT", 23,Address.builder().state("WestBengal").build());
		try {
			Employee clone = (Employee) employee.clone();
			clone.setAge(24);
			clone.address.setState("Delhi");
			System.out.println(employee);
			System.out.println(clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
