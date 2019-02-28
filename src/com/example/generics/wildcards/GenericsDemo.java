package com.example.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GenericsDemo {
    public static void main(String[] args) {
        List<Employee>lemp = new ArrayList<>();
        lemp.add(new Manager());
        lemp.add(new Engineer());
        
        List<Manager>lm = new ArrayList<>();
        lm.add(new Manager());
        lm.add(new Manager());
        
        List<Engineer>leng = new ArrayList<>();
        leng.add(new Engineer());
        leng.add(new PricipalEngineer());

        List<PricipalEngineer> lpe = new ArrayList<>();
        lpe.add(new PricipalEngineer());

        
        
//        List<Employee> lue1 = leng;
        
        List<? extends Employee>lue = leng;
        Employee emp = lue.get(0);
        lue.add(null);
        System.out.println("ob: " + emp);


        List<? super Engineer>lse = lemp;
        lse.add(new Engineer());
        //lse.add(new Manager());
        lse.add(new PricipalEngineer());

        lemp.addAll(lm);
        lemp.addAll(leng);
        System.out.println("lemp:" + lemp);
        
        
        //Generic functions
        Object o = "ABC";
        
        String erre = MyConverter.<String>convert(o);
        System.out.println("erre: " + erre);
        Manager m = MyConverter.getFirst(lm);
        
        
        //Convert Collection to array
        Employee[] empArr = lm.toArray(new Employee[0]);
        
        System.out.println(Arrays.toString(empArr));
        
    }

}
