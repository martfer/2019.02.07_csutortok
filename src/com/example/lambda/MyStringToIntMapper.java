package com.example.lambda;

public class MyStringToIntMapper implements StringToIntMapper{
    @Override
    public int map(String s) {
        return s.length() * s.length();
    }
}
