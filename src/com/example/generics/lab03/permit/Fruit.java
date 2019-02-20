package com.example.generics.lab03.permit;

public class Fruit implements Comparable<Fruit> {
    String name;
    int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int compareTo(Fruit that) {
        return Integer.compare(this.size, that.size);
    }

    public String toString() {
        return this.name + "(" + size + ")";
    }

    public boolean equals(Object o) {
        return (o instanceof Fruit &&
                name.equals(((Fruit) o).name) &&
                size == ((Fruit) o).size);
    }
}
