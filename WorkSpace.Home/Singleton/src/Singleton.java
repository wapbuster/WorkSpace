public class Singleton {
    private static Singleton instance = null;

    private Singleton(int a) {
        // Exists only to defeat instantiation.
        System.out.println(a);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(1);
        }
        return instance;
    }

    protected int addition(int a, int b){
        return a+b;
    }
}