package dishes;


// http://www.artima.com/objectsandjava/webuscript/PackagesAccess1.html
public class Cup {

    protected int getSize() {
        System.out.println("protected int getSize() in Cup class was called");
        return 1;
    }

    protected static int getCupsInUse() {
        System.out.println("protected static int getCupsInUse() in Cup class was called");
        return 3;
    }
}
