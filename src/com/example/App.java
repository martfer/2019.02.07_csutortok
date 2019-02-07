package com.example;

import com.example.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        App app = new App();

        Method[] methods = App.class.getDeclaredMethods();
        for (Method m : methods) {

            if (m.getAnnotation(Test.class) != null) {
                System.out.println(m);

//                m.invoke(app);
            }
        }
    }


    @Test
    public void method1() {
        System.out.println("running method1()");
    }


    public void method2() {
        System.out.println("running method2()");
    }


    public void method3() {
        System.out.println("running method3()");
    }

    @Test
    public void method4() {
        System.out.println("running method6()");
    }


    public void method5() {
        System.out.println("running method6()");
    }


    public void method6() {
        System.out.println("running method6()");
    }


}
