package main.java.designpatterns.creational.factory;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Singleton {

    private static Singleton singleton;

    private static int sayi = 0;

    private Singleton() {
        System.out.println("Ben oluştum");
    }

    public static Singleton getSingleton() {

        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }

        sayi++;
        System.out.println(sayi);

        return singleton;
    }
}
