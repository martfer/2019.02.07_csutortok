package other;

import dishes.Cup;


public class TeaMug extends Cup {
    public void someTeaAction() {
        // Any objects whose class descends from Cup
        // --instances of class CoffeeCup, CoffeeMug, EspressoCup, or TeaCup-- 
        // can invoke getSize() on themselves.
        getSize();
    }
}
