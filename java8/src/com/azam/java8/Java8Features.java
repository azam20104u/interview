package com.azam.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class Java8Features {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("John", "IT",45,Address.builder().state("Kolkata").build()),
				new Employee("Mike", "Finance",34,Address.builder().state("Kolkata").build()),
                new Employee("Peter", "HR",40,Address.builder().state("Kolkata").build()),
                new Employee("Mary", "Finance",50,Address.builder().state("Kolkata").build()),
                new Employee("Michael", "IT",29,Address.builder().state("Kolkata").build()),
                new Employee("Kiran", "Finance",60,Address.builder().state("Kolkata").build())
				);
		Map<String,Long> map = list
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		Set<Map.Entry<String, Long>> entrySet= map.entrySet();//map convert into Set of Entries collection
		LinkedHashMap<String,Long> linkedHashMap = entrySet.stream()
		//.sorted(Map.Entry.comparingByValue())
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.filter(e->e.getValue()<=5)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		System.out.println(linkedHashMap);
	}
}
