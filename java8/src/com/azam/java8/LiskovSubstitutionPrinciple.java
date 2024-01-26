package com.azam.java8;

import java.util.Arrays;
import java.util.List;

class Vehicle{
	public Integer numberOfWheels(){
		return 2;
	}
}
class EngineVehicle extends Vehicle{
	public Boolean hasEngine(){
		return true;
	}
}
class Bike extends EngineVehicle{
	
}
class Car extends EngineVehicle{
	public Integer numberOfWheels(){
        return 4;
    }
}
class Bycycle extends Vehicle{
	
}
//subclass must be substitutable for their base classes
public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		List<Vehicle> vehicleList = Arrays.asList(new Bike(),new Car(),new Bycycle());
		vehicleList.forEach((v)->System.out.println(v.numberOfWheels()));
		List<EngineVehicle> engVehicles = Arrays.asList(new Bike(),new Car());
		engVehicles.forEach((v)->System.out.println(v.hasEngine().toString()));
	}
}
