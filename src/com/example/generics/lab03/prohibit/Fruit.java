package com.example.generics.lab03.prohibit;

public class Fruit {
    protected String name;
    protected int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public boolean equals(Object o) {
        if (o instanceof Fruit) {
            Fruit that = (Fruit) o;
            return this.name == that.name && this.size == that.size;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name + "(" + size + ")";
    }
}
