
package com.example.exceptions;

import com.example.exceptions.basics.MyException;

public class FinallyTest {

    private static int hello()  {

        try {
            System.out.println("hello body");
//            return 0;
            throw new MyException("hello");
//        }
// catch( MyException me) {
//            throw  new RuntimeException();
        } finally {
            System.out.println("hello finally");
//                return 4;
            throw new OutOfMemoryError("sorry...");
        }

    }

    public static void main(String[] args) {
        System.out.println("doit: " + hello());
        

    }
}
