package com.example.generics.lab02.first_approach;

public interface MyCollection<E> extends Iterable<E> {
    public boolean contains(Object o);
    public boolean containsAll(MyCollection<?> c);
}
