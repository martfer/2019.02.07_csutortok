package com.example.lambda;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        String[] input = {"Hello", "1", "World", "lLlL"};

        System.out.println(Arrays.toString(stringArrayMapper(input, String::length)));

        System.out.println(Arrays.toString(stringArrayMapper(input, String::hashCode)));

        System.out.println(Arrays.toString(stringArrayMapper(input, MethodReferenceDemo::lsInString)));

    }

    public static int[] stringArrayMapper(String[] sArr, ToIntFunction<String> mapper) {
        int[] result = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            result[i] = mapper.applyAsInt(sArr[i]);
        }
        return result;
    }

    public static int lsInString(String s) {
        Pattern p = Pattern.compile("l");
        Matcher matcher = p.matcher(s);
        int cnt = 0;
        while( matcher.find() )  {
            cnt++;
        }
        return cnt;
    }
}
