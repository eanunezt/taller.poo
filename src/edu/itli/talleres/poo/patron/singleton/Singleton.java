package edu.itli.talleres.poo.patron.singleton;


public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("foo");
        }
        return instance;
    }
}