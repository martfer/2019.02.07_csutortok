package com.example.practise;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterfaceListDemo {

    public static void main(String[] args) {

        System.out.println("All Implemented Interfaces:");
        System.out.println(showInterfaces(JTextField.class));

    }


    public static String showInterfaces( Class c) {
        Set<Class> s = new HashSet<>();
        new ArrayList<>(s);

        do {
            for (Class iface : c.getInterfaces()) {
                // add the interface to the Set
                s.add(iface);
                // and add all interfaces that it extends
                s.addAll(Arrays.asList(iface.getInterfaces()));
            }
        } while ((c = c.getSuperclass()) != null);

        StringBuilder sb = new StringBuilder();
        for (Class iface : s) {
                sb.append(iface.getSimpleName());
                sb.append(", ");

        }
        // exclude the trailing ", "
        return sb.substring(0, sb.length() - 2);
    }
}
