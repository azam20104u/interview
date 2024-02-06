package com.azam.java8;

import java.util.Optional;

public class OptionalDemo {
    //=======without optional=======
    /*static String getData(int id){
        if (id == 101){
            return "Ram";
        }else {
            return null;
        }
    }
    public static void main(String[] args) {
        String data = getData(100);
        if (data != null){
            System.out.println(data.toUpperCase());
        }else{
            System.out.println("No data");
        }
    }*/

    //=======with optional=======
    static Optional<String> getData(int id){
        if (id == 101){
            return Optional.ofNullable("Ram");
        }else {
            return Optional.ofNullable(null);
        }
    }
    public static void main(String[] args) {
        Optional<String> data = getData(101);
        System.out.println(data.orElse("No data"));
    }
}
