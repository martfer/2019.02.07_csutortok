package com.example.lambda;


import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        li.stream()
//                .mapToInt(value -> value.intValue())
//                .sum();


//        for (int i = 0; i < li.size() ; i++) {
//            // process(li.get(i));
//            System.out.println(li.get(i));
//        }
//
//        for (Integer integer : li) {
//            // process(integer);
//            System.out.println(integer);
//        }

        li.stream()
                .parallel()
                .forEach(x -> System.out.println(x));



    }
}
