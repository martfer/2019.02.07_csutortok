package com.example.generics.lab03.prohibit;

public class Orange extends Fruit implements Comparable<Orange> {
    public Orange(int size) {
        super("Orange", size);
    }

    public int compareTo(Orange that) {
        return Integer.compare(this.size, that.size);
//        return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
    }
}
