package com.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();

        System.out.println("size = " + ss.size());
        boolean success = ss.add("cica");
        success = ss.add("cica");
//        ss.add(Integer.valueOf(2));
//        ss.add(new int[3]);
        for (String s : ss) {
            System.out.println();
        }



//        Set<String> ss2 = new HashSet<>();
//        ss2.add("1");
//        ss2.add("2");
//
//        ss.addAll(ss2);

        System.out.println("size = " + ss.size());
        System.out.println(ss);

    }

}
