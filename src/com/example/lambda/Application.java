package com.example.lambda;


import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        (int x) -> x + 1;

        StringToIntMapper mp = s -> s.length();


        String[] input = {"Hello", "1", "World", "!!!"};

        int[] ints = stringArrayMapper(input, x -> x.length() + 3);
        System.out.println(Arrays.toString(ints));

        ints = stringArrayMapper(input, x -> {
            if (x.length() < 5) {
                return -1;
            }
            return x.length();
        });

//        int[] ints = stringArrayMapper(input, (x) -> x.length() + 3 );

        ints = stringArrayMapper(input, new StringToIntMapper() {
            @Override
            public int map(String s) {
                return s.length() + 3;
            }
        });

//        int[] ints = stringArrayMapper(input, new MyStringToIntMapper());
        System.out.println(Arrays.toString(ints));

    }

    public static int[] stringArrayMapper(String[] sArr, StringToIntMapper mapper) {
        int[] result = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            result[i] = mapper.map(sArr[i]);
        }
        return result;
    }

}
