package com.example.Enum;

public class ColorsTypeSafePattern {
    final static public ColorsTypeSafePattern RED = new ColorsTypeSafePattern(0, 10);
    final static public ColorsTypeSafePattern GREEN = new ColorsTypeSafePattern(1, 1);
    final static public ColorsTypeSafePattern BLUE = new ColorsTypeSafePattern(2, 1);

    final private int ordinal;
    final private int weight;

    private ColorsTypeSafePattern(int ordinal, int weight) {
        this.ordinal = ordinal;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
