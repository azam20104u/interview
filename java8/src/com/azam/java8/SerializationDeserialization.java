package com.azam.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {
	public static void main(String[] args) {

		try {
			Employee emp = new Employee("Azam", "IT", 23,Address.builder().state("Kolkata").build());
			FileOutputStream out = new FileOutputStream("emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(emp);
			System.out.println("Serialization is complete");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream in = new FileInputStream("emp.txt");
			ObjectInputStream ois = new ObjectInputStream(in);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
			System.out.println("De-Serialization is complete");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
