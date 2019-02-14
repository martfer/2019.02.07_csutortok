package com.example.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WrapperDemo {

    public static void main(String[] args) {



        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = List.of(1, 2, 3);


        Integer i = 333;
        Short s = 3;


        System.out.println(i + s);
        System.out.println(s.intValue() == s.intValue());


        Integer integer = Integer.valueOf(13);

        List<Integer>list = new ArrayList<>();

        list.add(integer);
        list.add(Integer.valueOf(15));
        list.add(3);
        list.add(Integer.MAX_VALUE+1);

        Integer result = list.get(0);
        System.out.println(result + 9 );
        System.out.println(list);

    }


}
