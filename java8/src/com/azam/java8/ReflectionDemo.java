package com.azam.java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*The selected code is a part of a Java program that demonstrates the use of reflection, a Java feature that allows you to dynamically manipulate classes, objects, and their members at runtime.

In this case, the code is using reflection to:

1.
Load the class com.azam.java8.Demo using the Class.forName() method.
2.
Get an array of all the declared constructors of the class using the getDeclaredConstructors() method.
3.
Iterate through the array of constructors and set the setAccessible(true) flag to allow the JVM to access the constructor.
4.
Use the newInstance() method to instantiate a new instance of the class.
5.
Print the instantiated object using the System.out.println() method.
6.
Get an array of all the declared fields of the class using the getDeclaredFields() method.
7.
Iterate through the array of fields and set the setAccessible(true) flag to allow the JVM to access the field.
8.
Print the name of the field using the System.out.println() method.
9.
Get the value of the field using the getInt() method and print it using the System.out.println() method.
10.
Check if the name of the field is "min", and if so, increase its value by 10 and print the new value using the set() and getInt() methods.
11.
Get an array of all the declared methods of the class using the getDeclaredMethods() method.
12.
Iterate through the array of methods and set the setAccessible(true) flag to allow the JVM to access the method.
13.
Print the name of the method using the System.out.println() method.
14.
Invoke the method on the instantiated object using the invoke() method.*/
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.azam.java8.Demo");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        Demo demo =null;
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            demo = (Demo) constructor.newInstance();
        }
        System.out.println(demo);
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            System.out.println(field.getInt(demo));
            if(field.getName().equals("min")) {
                field.set(demo, field.getInt(demo) + 10);
                System.out.println(field.getInt(demo));
            }
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
            method.setAccessible(true);
            method.invoke(demo);
        }
    }
}
