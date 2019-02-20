package dishes;


public class TestProtectedAccess {
    // you can access protected members in the same package!!!!!
    public static void main(String[] args) {
        System.out.println(Cup.getCupsInUse());
        System.out.println(new Cup().getSize());
    }
}
