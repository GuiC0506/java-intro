package app;
import testPackage.testClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        Main.test("Test message");

        testClass test = new testClass("churros", 16);
        System.out.println(test.getName());
    }

    public static void test(String message) {
        System.out.println(message);
    }
}
