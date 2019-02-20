package com.example.generics.lab02.second_approach;

public interface MyCollection<E>  extends Iterable<E> {
    public boolean contains(E o);
    public boolean containsAll(MyCollection<? extends E> c);
}
