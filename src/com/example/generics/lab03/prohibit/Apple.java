package com.example.generics.lab03.prohibit;

public class Apple extends Fruit implements Comparable<Apple> {
    public Apple(int size) {
        super("Apple", size);
    }

    public int compareTo(Apple that) {
//        return Integer.compare(this.size, that.size);
        return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
    }
}
