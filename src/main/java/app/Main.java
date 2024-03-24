package app;

import java.awt.print.Printable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FPrintf.Start();
        Fear fear = new Fear("dark", 4);
        Phobia phobia = new Phobia("tassalophobia", 3);
        ArrayList<Fear> fears = new ArrayList<>();
        fears.add(new Fear("light", 1));
        fears.add(new Fear("frog", 3));
        fears.add(new Phobia("randomphobia", 1));
        // subclasses instances can be part of super class data structures
        fear.feel();
        phobia.feel();


        fears.get(0).feel();
        System.out.println("=======\n");

        AbstractionImplementation abstraction = new AbstractionImplementation();
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        System.out.println(fear.getLevel());
        
        // Exceptions.Start();
        Cat cat = new Cat();
        cat.print("Meow");
        // since Cat class implements the "IPrintable" interface, it can be passed as a parameter
        printThing(cat);
        // lambdas work with parameters typed by an interface
        // instead of passing an object that contains an implementation of a specific method
        // defined inside an interface, it can be passed a lambda expression that does that
        // action.
        printThing(suffix ->  System.out.println("Meow"));

        IPrintable lambdaPrintable = (suffix) -> System.out.println(suffix);
        }

        public static void test(String message) {
            System.out.println(message);
        }

        public static void printThing(IPrintable thing) {
            thing.print("Meow");
        }
    }
