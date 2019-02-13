
package com.example.exceptions;

import com.example.exceptions.basics.MyException;

public class FinallyTest {

    private static int hello()  {

        Throwable ee = null;

        try {
            System.out.println("hello body");
//            return 0;
            throw new MyException("hello");
        } catch (MyException me) {
            ee = me;
            throw me;
//            throw  new RuntimeException();
        } finally {
            System.out.println("hello finally");
//                return 4;
            OutOfMemoryError oume = new OutOfMemoryError();
            if (ee != null) {
                oume.addSuppressed(ee);
            }
            throw oume;
        }

    }

    public static void main(String[] args) {
        System.out.println("doit: " + hello());
        

    }
}
