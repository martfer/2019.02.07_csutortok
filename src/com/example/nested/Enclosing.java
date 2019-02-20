package com.example.nested;

public class Enclosing {

    private int value = 0;

    private static class A {
        private int tmp = 0;
        private static String hello() {
            return "Hello from Enclosing.A.hello";
        }
        private static String callEnclosingBCHello() {
            return Enclosing.B.C.hello(); // compiles and runs without errors
        }
    }

    private static class B {
        private static class C {
            private static String hello() {
                int value = new Enclosing().value;
                value = new Enclosing.A().tmp;
                return "Hello from Enclosing.B.C.hello()";
            }
            private static String callEnclosingAHello() {
                return Enclosing.A.hello(); // compiles and runs without errors
            }
        }

        private static String hello() {
            return "Hello from Enclosing.B.hello() ";
        }
    }

    public static void main(String[] args) {
        System.out.println(Enclosing.A.hello());
        System.out.println(Enclosing.A.callEnclosingBCHello());
        System.out.println(Enclosing.B.C.hello());
        System.out.println(Enclosing.B.C.callEnclosingAHello());
    }
}
