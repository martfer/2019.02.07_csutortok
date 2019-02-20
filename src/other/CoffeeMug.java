
package other;


public class CoffeeMug  extends CoffeeCup {
    public void someAction() {
        // Any objects whose class descends from Cup
        // --instances of class CoffeeCup, CoffeeMug, EspressoCup, or TeaCup-- 
        // can invoke getSize() on themselves.
        getSize();
    }
}
