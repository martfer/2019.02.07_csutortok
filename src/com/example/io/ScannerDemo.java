package com.example.io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Path path = Path.of("/Users/martfer/Documents/Takarékinfo/delphi/2019.02.07_csutortok/adoszamok.txt");


//        try (Scanner lineScanner = new Scanner(path), StandardCharsets.UTF_8)  {
//            while(lineScanner.hasNextLine()) {
//                String line = lineScanner.nextLine();
//                System.out.println(tokenizeLine(line));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Files.readString(path);

        try (FileReader fr = new FileReader(path.toFile(), StandardCharsets.UTF_8)) {
            int i = -1;

            while ((i = fr.read()) != -1) {
                StringBuilder sb = new StringBuilder();
                while (i != '\n' && i != -1) {
                    sb.append((char) i);
                    i = fr.read();
                }
                System.out.println(tokenizeLine(sb.toString()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


//        try (BufferedReader br = new BufferedReader(
//                new FileReader(path.toFile(), StandardCharsets.UTF_8))) {
//            String line = null;
//            while( (line = br.readLine()) != null) {
//                System.out.println(tokenizeLine(line));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    private static String tokenizeLine(String line) {
        String result = "";
        Scanner scanner = new Scanner(line).useDelimiter("-");
        while (scanner.hasNext()) {
            result += scanner.next() + "\t|\t";
        }
        return result;
    }


}
