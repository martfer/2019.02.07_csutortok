package com.example.nested;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Container container = new Container();
        Iterator iterator = container.iterator();

//        for (Method method : iterator.getClass().getMethods()) {
//            System.out.println(method);
//        }

        Method method = iterator.getClass().getMethod("doIt");
        method.invoke(iterator);

        System.out.println(iterator.getClass());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
