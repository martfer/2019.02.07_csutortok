package com.example.generics.basics;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Wrapper<Integer> w = new Wrapper<>(1);
//        w.setValue("cica");
//        String value = w.getValue();


        w = new Wrapper<Integer>(1);
        Wrapper wRaw = w;
        wRaw.setValue("sdsdd");

        Integer value = w.getValue();


        Wrapper n2 = new Wrapper(5);

//        System.out.println(max(n1, n2));
    }


    public static <E extends Comparable<E> > E max(E e1, E e2) {
            if( e1.compareTo(e2) > 0) {
                return e1;
            } else {
                return e2;
            }
    }

}
