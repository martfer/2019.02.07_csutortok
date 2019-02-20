package com.example.nested;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        Iterator iterator = container.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
