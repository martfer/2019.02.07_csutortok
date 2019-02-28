package com.example.generics.basics;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

        Integer i = 1;
        Object o = i;

//        Integer[] iArr = {1, 2, 3};
//        Object[] oArr;
//
//        oArr = iArr;
//        oArr[0] = "cica";


        List<Integer> intl = new ArrayList<>();
        intl.add(1);
        List<?> objl = intl;
//        objl.add(null);
        Object o1 = objl.get(0);
//        Integer integer = intl.get(1);

//        log(iArr);
        logG(intl);

    }

    static void logG(List<?> objs) {
        for (Object obj : objs) {
            System.out.println(obj);
        }
    }


    static void log(Object[] objs) {
        for (Object obj : objs) {
            System.out.println(obj);
        }
    }


}
