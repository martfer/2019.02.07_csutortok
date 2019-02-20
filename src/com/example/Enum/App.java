package com.example.Enum;


import static com.example.Enum.MyColors.BLUE;

public class App {
    public static void main(String[] args) {

        MyColors mc = BLUE;
        System.out.println(BLUE.getClass().getSuperclass());

        for (MyColors c : MyColors.values()) {
            System.out.println(c);
        }



   }
        static public boolean testEnum(ColorsTypeSafePattern c) {
            return c.getWeight() > 5;
        }
}
