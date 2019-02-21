/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.generics.wildcards;

import java.util.Collection;

public class MyConverter {

    public static <Tipus> Tipus convert(Object o) {
        return (Tipus) o;
    }

    public static <E1> E1 getFirst(Collection<E1> coll) {
        return coll.iterator().next();
    }
}
