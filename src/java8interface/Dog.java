package java8interface;

public class Dog implements Animal {
    public void sound() {
        System.out.println("Barking....");
    }
}

class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
        Animal.sleep();
    }
}