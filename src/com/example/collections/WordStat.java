package com.example.collections;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordStat {

    public static void main(String[] args) {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/delphi/2019.02.07_csutortok/nemzeti_dal.txt");


        // a delimeter REGEX
        // white space, vessző, pont, pontosvessző, felkiáltójel, kérdőjel
        // egy vagy többször
        try (Scanner scanner = new Scanner(p, UTF_8).useDelimiter("[\\s,.;!?]+")) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
