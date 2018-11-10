public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Singleton tmp = Singleton.getInstance( );
        System.out.println(tmp.addition(2,5));
        System.out.println(tmp.addition(5,5));
    }
}
