package com.example.exceptions;


import com.example.exceptions.basics.MyException;

public class AutoClosableTest {




    public static void main(String[] args) throws MyException {
        try (MyResource r = new MyResource()) {
            System.out.println("dolgoz, dolgoz: " + r.getMyName());
            throw new RuntimeException("hello, from exception");
        } catch (MyException ex) {
            System.out.println("MyException occured");
        }
        System.out.println("after try");
//
//        MyResource r = new MyResource();
//        try  {
//            System.out.println("dolgoz, dolgoz: " + r.getMyName());
//            throw new RuntimeException("hello, from exception");
//
//        } finally {
//            r.close();
//        }



    }

    public static void doIT()  throws MyException{
        MyResource r = new MyResource();
        try  {
            System.out.println("dolgoz, dolgoz: " + r.getMyName());
            throw new RuntimeException("hello, from exception");

        } finally {
            r.close();
        }
    }


    public static void main1(String[] args) throws MyException {
        MyResource r = null;
        Throwable saved = null;
        try {
            r = new MyResource();
            System.out.println("dolgoz, dolgoz: " + r.getMyName());
            throw new RuntimeException("hello there was an exception in your try block");
        } catch (RuntimeException | Error ex) {
            System.out.println("Exception occured" + ex);
            saved = ex;
            throw ex;
        } finally {
            try {
                r.close();
            } catch (MyException ex) {
                if (saved != null) {
                    saved.addSuppressed(ex);
                } else {
                    throw ex;
                }
            }
        }

//        System.out.println("after try");
    }


}
