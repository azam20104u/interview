package com.azam.java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
