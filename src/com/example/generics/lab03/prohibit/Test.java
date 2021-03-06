package com.example.generics.lab03.prohibit;


import java.util.Collection;
import java.util.List;


public class Test {

    public static void main(String... args) {

        List<Apple> apples = List.of(new Apple(1), new Apple(10));
        List<Orange> oranges = List.of(new Orange(1), new Orange(10));
        List<Fruit> fruits = List.of(new Apple(1), new Orange(10));

//        System.out.println("Collections.max(apples).equals(new Apple(10)) = " + max(apples).equals(new Apple(10)));
//        System.out.println("Collections.max(oranges).equals(new Orange(10)) = " + max(oranges).equals(new Orange(10)));
        // compile-time error
//        System.out.println("Collections.max(fruits).equals(new Orange(10)) = " + max(fruits).equals(new Orange(10)));
//        System.out.println(max(fruits));
//        System.out.println(Test.<Fruit>max(apples));

        Apple weeApple = new Apple(1);
        Apple bigApple = new Apple(2);
        apples = List.of(weeApple, bigApple);
        System.out.println("weeApple.compareTo(bigApple) = " + weeApple.compareTo(bigApple));
//        System.out.println("Collections.max(apples) == bigApple = " + (max(apples) == bigApple));
    }

    // write  a static max() method that takes a collection and
    // returns the element with maximum value
    // The tests above should succeed
//    public static ...

}
