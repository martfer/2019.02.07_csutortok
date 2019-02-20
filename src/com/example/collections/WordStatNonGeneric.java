package com.example.collections;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordStatNonGeneric {

    public static void main(String[] args) {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/delphi/2019.02.07_csutortok/nemzeti_dal.txt");


        Map stat = new HashMap();

        // delimeter can be REGEX
        // white space, coma, dot, semi colon, exclamation mark, question mark, dash
        // once or more
        try (Scanner scanner = new Scanner(p, UTF_8).useDelimiter("[\\s,.;!?-]+")) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
//                System.out.println(scanner.next());
                if (stat.get(word) == null) {
                    stat.put(word, 1);              //Boxing 1 into Integer
                } else {
                    int num = (int) stat.get(word);       //Unboxing Integer to int
                    stat.put(word, num + 1);             //Boxing int into Integer
                }
                //stat.put(word, stat.getOrDefault(word, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set entrySet = stat.entrySet();
        List entryList = new ArrayList<>(entrySet);


        entryList.sort( new MyReversed(new MyComparator()) );

        for (int i = 0; i < 5; i++) {
            System.out.println(entryList.get(i));
        }
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry m1 = (Map.Entry) o1;
        Map.Entry m2 = (Map.Entry) o2;
        Comparable comp = (Comparable)m1.getValue();

        return comp.compareTo(m2.getValue());
    }
}

class MyReversed implements Comparator {
    Comparator tmp;

    public MyReversed(Comparator tmp) {
        this.tmp = tmp;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return tmp.compare(o2, o1);
    }

}
