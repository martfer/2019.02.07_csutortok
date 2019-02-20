package com.example.nested;

import java.util.Iterator;

public class Container implements Iterable {
    private int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    @Override
    public Iterator iterator() {
        int i = 10;
        String s = "123";

//        class ContainerIterator implements Iterator {
//            private int cnt = i;
//
//            @Override
//            public boolean hasNext() {
//                return cnt < values.length;
//            }
//
//            @Override
//            public Object next() {
//                return values[cnt++];
//            }
//        }
//
//        return new ContainerIterator();



        return new Iterator() {
            private int cnt = 0;
            @Override
            public boolean hasNext() {
                return cnt < values.length;
            }
            public void doIt() {
                System.out.println("WWWWWWWWWWSW");
            }


            @Override
            public Object next() {
                return values[cnt++];
            }
        };

    }

//    private class ContainerIterator implements Iterator {
//        private int cnt = 0;
//
//        @Override
//        public boolean hasNext() {
//            return cnt < values.length;
//        }
//
//        @Override
//        public Object next() {
//            return values[cnt++];
//        }
//    }
}
