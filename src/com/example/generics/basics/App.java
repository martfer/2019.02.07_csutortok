package com.example.generics.basics;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Wrapper<Integer> n1 = new Wrapper<Integer>(1);

        Wrapper<Integer> n2 = new Wrapper<Integer>(5);

        System.out.println(max(n1, n2));
    }


    public static <E extends Comparable<E>> E max(E e1, E e2) {
            if( e1.compareTo(e2) > 0) {
                return e1;
            } else {
                return e2;
            }
    }

}
