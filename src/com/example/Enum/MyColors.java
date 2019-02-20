package com.example.Enum;

public enum MyColors {
    RED (10),
    GREEN ( 1, "zöld"),
    BLUE ( 1, "kék");

    final private int weight;
    final private String aneve;

    private MyColors(int weight) {
        this.aneve = "alapértelmezett";
        this.weight = weight;
    }

    MyColors(int weight, String aneve) {
        this.weight = weight;
        this.aneve = aneve;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return aneve;
    }
}
