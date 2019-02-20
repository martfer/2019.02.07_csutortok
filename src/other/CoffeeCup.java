
package other;

import dishes.Cup;


public class CoffeeCup extends Cup {

    public void doSomething(Cup c) {
        getSize();
//     c.getSize();
    }

    public void doSomething2(EspressoMug e) {
        getSize();
        e.getSize();
    }

    public static void main(String[] args) {

        // If a protected instance variable or instance method is accessible 
        // to a class, that class can access the protected member through a 
        // reference only if the reference type is the class or one of its subclasses.
        CoffeeCup coffeeCup = new CoffeeCup();
        EspressoMug espressoMug = new EspressoMug();


        coffeeCup.getSize();
        espressoMug.getSize();

        Cup cup = new Cup();
//        cup.getSize();

        TeaMug teaMug = new TeaMug();
//       teaMug.getSize();
        teaMug.someTeaAction();




        // Any code in a subclass of Cup can access a static getCupsInUse()
        // by invoking it on itself or invoking it on a reference 
        // of type Cup or any of its subclasses
        Cup.getCupsInUse();
        coffeeCup.getCupsInUse();
        espressoMug.getCupsInUse();
        cup.getCupsInUse();
        teaMug.getCupsInUse();
    }

}
