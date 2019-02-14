package com.example.collections;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordStat {

    public static void main(String[] args) {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/delphi/2019.02.07_csutortok/nemzeti_dal.txt");

        Map<String, Integer> stat = new HashMap<>();

        // delimeter can be REGEX
        // white space, coma, dot, semi colon, exclamation mark, question mark, dash
        // once or more
        try (Scanner scanner = new Scanner(p, UTF_8).useDelimiter("[\\s,.;!?-]+")) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
//                System.out.println(scanner.next());
                if (stat.get(word) == null) {
                    stat.put(word, 1); //Boxing 1 into Integer
                } else {
                    int num = stat.get(word);   //Unboxing Integer to int
                    stat.put(word, num + 1);    //Boxing int into Integer
                }
                //stat.put(word, stat.getOrDefault(word, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<Map.Entry<String, Integer>> entrySet = stat.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);




        entryList.sort(new MyComparator().reversed());
//        entryList.sort(Map.Entry.<String, Integer>comparingByValue());

        for (int i = 0; i < 5; i++) {
            System.out.println(entryList.get(i));
        }




//        System.out.println(stat);

    }
}

class MyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {
        return Integer.compare(me1.getValue(), me2.getValue());
    }
}
