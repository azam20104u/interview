package com.azam.generics;

import java.util.ArrayList;
import java.util.List;

//========= Without Generic===========
class IntegerPrint{
	Integer i;
	public IntegerPrint(Integer i){
        this.i=i;
    }
	void print() {
		System.out.println(i);
	}
}
class DoublePrint{
	Double i;
	public DoublePrint(Double i){
        this.i=i;
    }
	void print() {
		System.out.println(i);
	}
}
//======== with Generic class========== 
class GenericPrint <T>{
	T i;
	public GenericPrint(T i){
        this.i=i;
    }
	void print() {
        System.out.println(i);
    }
}
public class GenericsDemo {
	//generic method
	static <T> void print(T i) {
		System.out.println(i);
	}
	//without wildcard
	static void printList(List<Object> list) {
		System.out.println(list);
	}
	//with wildcard
	static void printListWildCard(List<?> list) {
        System.out.println(list);
    }
	public static void main(String[] args) {
		// Without Generic
		IntegerPrint i = new IntegerPrint(10);
		i.print();
		DoublePrint d = new DoublePrint(10.0);
		d.print();
		// with Generic
		GenericPrint<Integer> g = new GenericPrint<Integer>(10);
		g.print();
		GenericPrint<Double> h = new GenericPrint<Double>(10.0);
		h.print();
		print(10);
		//printList(new ArrayList<Integer>());//compilation error, compiler won't allow
		printListWildCard(new ArrayList<Integer>());//no error
	}
}
