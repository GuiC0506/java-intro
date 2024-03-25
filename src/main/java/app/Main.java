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
        Lambdas.Start();
    }

    public static void test(String message) {
        System.out.println(message);
    }

}
