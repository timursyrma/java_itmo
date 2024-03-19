package com.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = ExampleClass.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        ExampleClass obj = (ExampleClass) clazz.getDeclaredConstructor(int.class).newInstance(10);
        System.out.println(obj.getValue());

        Field valueField = clazz.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.setInt(obj, 20);
        System.out.println(obj.getValue());

        Method printValueMethod = clazz.getDeclaredMethod("printValue");
        printValueMethod.setAccessible(true);
        printValueMethod.invoke(obj);
    }
}

class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    private void printValue() {
        System.out.println("Значение поля value: " + value);
    }

    public int getValue() {
        return value;
    }
}