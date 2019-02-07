package com.example;

import com.example.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    private String name;

    public App(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        App first = new App("first");
        App second = new App("second");


        Method[] methods = App.class.getDeclaredMethods();
        for (Method m : methods) {

            if (m.getAnnotation(Test.class) != null) {
                System.out.println(m);

                m.invoke(first);
            }
        }
    }


    @Test
    public void method1() {
        System.out.println("running method1() in instance " + name);
    }


    public void method2() {
        System.out.println("running method2() in instance " + name);
    }


    public void method3() {
        System.out.println("running method3() in instance "  + name);
    }

    @Test
    public void method4() {
        System.out.println("running method6() in instance " + name);
    }


    public void method5() {
        System.out.println("running method6() in instance " + name);
    }


    public void method6() {
        System.out.println("running method6() in instance " + name);
    }


}
