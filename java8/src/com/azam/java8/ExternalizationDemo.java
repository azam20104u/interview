package com.azam.java8;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
class ExDemo implements Externalizable{
	int id;
	String name;
	String address;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(address);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
		address = (String) in.readObject();
	}
}
public class ExternalizationDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("exdemo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			ExDemo ex = ExDemo.builder().id(101).name("Ram").address("Delhi").build();
			oos.writeObject(ex);
			oos.close();
			out.close();
			System.out.println("Serialization completed");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exdemo.ser"));
			ExDemo ex1 = (ExDemo) ois.readObject();
			System.out.println(ex1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
