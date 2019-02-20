package com.example.generics.lab01;

import java.util.Collection;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        System.out.println(strings);
//        System.out.println("max(strings) = " + max(strings));

        List<Integer> ints = List.of(1,2,3,4,5);
        System.out.println(ints);
//        System.out.println("max(ints) = " + max(ints));

        // Will not compile
//        List<Number> nums = List.of(1,2,3,4,5);
//        System.out.println(nums);
//        System.out.println("max(nums) = " + max(nums));
    }

    // write  a static max() method that takes a collection and
    // returns the element with maximum value
    // The tests above should succeed
//    public static ...
}
