package com.example.generics.lab02.second_approach;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Object obj = "prohibit";
        MyCollectionImpl<Object> objs = new MyCollectionImpl(List.of("prohibit", 2, 3.14, 4));
        System.out.println("objs = " + objs);
        System.out.println("objs.contains(obj) = " + objs.contains(obj));


        MyCollection<Integer> ints = new MyCollectionImpl(List.of(2, 4));
        System.out.println("ints = " + ints);
        System.out.println("objs.containsAll(ints) = " + objs.containsAll(ints));

        obj = 1;
        objs = new MyCollectionImpl(List.of(1, 3));
        System.out.println("objs = " + objs);
        ints = new MyCollectionImpl(List.of(1, 2, 3, 4));
        System.out.println("ints = " + ints);

        contains(ints, 1);

        // Will not compile
//        System.out.println("ints.contains(obj) = " + ints.contains(obj));
//        System.out.println("ints.containsAll(objs) = " + ints.containsAll(objs);
    }

    public static <E> boolean contains(MyCollection<?> coll, E e) {
//        return coll.contains(e);
        return true;


    }

}
