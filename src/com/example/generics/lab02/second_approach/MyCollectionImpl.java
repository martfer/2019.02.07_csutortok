package com.example.generics.lab02.second_approach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionImpl<E> implements MyCollection<E> {
    // implement this class so it passes the tests in Test class

    public MyCollectionImpl(List<E> values) {
        // initialise your class with values from the list
    }

    @Override
    public boolean contains(E o) {
        // implement method
        return false;
    }

    @Override
    public boolean containsAll(MyCollection<? extends E> c) {
        // implement method
        return false;
    }

    @Override
    public String toString() {
        // implement method
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        // implement method
        return null;
    }
}
