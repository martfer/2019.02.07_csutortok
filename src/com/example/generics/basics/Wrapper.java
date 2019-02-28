package com.example.generics.basics;

public class Wrapper<E> implements Comparable<Wrapper<E>> {
    private E value;

    public Wrapper(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public static <T> T cast(Object o ) {
        return (T)o;
    }

    @Override
    public int compareTo(Wrapper o) {
        return 0;
    }
}
