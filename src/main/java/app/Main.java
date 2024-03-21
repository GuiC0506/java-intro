package app;

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
        final int fearsCreated = Fear.getFearsCreated();
        System.out.println("=======\n");
        System.out.println(fearsCreated);

        AbstractionImplementation abstraction = new AbstractionImplementation();
    }

    public static void test(String message) {
        System.out.println(message);
    }
}
