package ggg.codejava.kit;

public abstract class Animal {

    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    // Implement abstract method
    void  sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}