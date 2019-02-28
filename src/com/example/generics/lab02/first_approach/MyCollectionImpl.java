package com.example.generics.lab02.first_approach;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyCollectionImpl<E> implements MyCollection<E> {
    private List<E> values;
    // implement this class so it passes the tests in Test class

    public MyCollectionImpl(List<E> values) {
        // initialise your class with values from the list
    }

    @Override
    public boolean contains(Object o) {
        // implement method
        return false;
    }

    @Override
    public boolean containsAll(MyCollection<?> c) {
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
