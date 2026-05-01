package ggg.codejava.kit;

public class MEthodOverloadingDemo {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static float addition(float a, float b) {
        return a + b;
    }

    public static float addition(int a, float b) {
        return a + b;
    }

    public static String addition(String a, String b) {
        return a + b;
    }

    public void display() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        System.out.println(addition(10, 20));           // int
        System.out.println(addition(10.5f, 5.5f));      // float
        System.out.println(addition(10, 5.5f));         // int + float
        System.out.println(addition("Hello ", "Java")); // String

        MEthodOverloadingDemo obj = new MEthodOverloadingDemo();
        obj.display();
    }
}