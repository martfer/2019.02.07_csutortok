package com.example.practise;

import java.util.Arrays;

public class InterfaceDemoChild extends InterfaceDemo {

    public static void main(String[] args) {
        A a = new InterfaceDemoChild();
        B b = new InterfaceDemoChild();

//        System.out.println(Arrays.toString(InterfaceDemoChild.class.getInterfaces()));
//        System.out.println(Arrays.toString(InterfaceDemo.class.getInterfaces()));
        System.out.println(Arrays.toString(B.class.getInterfaces()));
        System.out.println(B.class.getSuperclass());


    }
}
