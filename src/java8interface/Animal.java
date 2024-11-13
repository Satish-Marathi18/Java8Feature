package java8interface;

public interface Animal {
    void sound();

    //default method
    default void eat() {
        System.out.println("Eating...");
    }

    //static method
    static void sleep() {
        System.out.println("Sleeping...");
    }
}
