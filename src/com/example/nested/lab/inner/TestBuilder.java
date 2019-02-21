package com.example.nested.lab.inner;



public class TestBuilder {

    public static void main(String[] args) {



        Address myAddress = Address.builder().
                firstName("Béla").
//                lastName("Kovács").
                country("Magyarország").
                city("Budapest").
//                zip("1161").
                street("Kossuth utca 4.").
                build();

        System.out.println(myAddress);

        Address myAddress2 = Address.builder().
                country("Magyarország").
                city("Budapest").
                zip("1161").
                street("Kossuth utca 4.").
                build();

        System.out.println(myAddress2);

//        AddressWithNestedBuilder myAddress3 = AddressWithNestedBuilder.builder().
//                firstName("Béla").
//                lastName("Kovács").
//                country("Magyarország").
//                city("Budapest").
//                zip("1161").
//                street("Kossuth utca 4.").
//                build();
//
//        System.out.println(myAddress3);
//
//
//        AddressWithInnerBuilder myAddress4 = AddressWithInnerBuilder.builder().
//                firstName("Béla").
//                lastName("Kovács").
//                country("Magyarország").
//                city("Budapest").
//                zip("1161").
//                street("Kossuth utca 4.").
//                build();
//
//        System.out.println(myAddress4);
    }

}
