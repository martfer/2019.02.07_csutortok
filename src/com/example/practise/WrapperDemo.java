package com.example.practise;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {



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
