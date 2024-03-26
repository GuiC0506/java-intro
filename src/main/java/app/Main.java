package app;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String name = "churros";


        FPrintf.Start();
        Fear fear = new Fear("dark", 4);
        Phobia phobia = new Phobia("tassalophobia", 3);
        ArrayList<Fear> fears = new ArrayList<>();
        fears.add(new Fear("light", 1));
        fears.add(new Fear("frog", 3));
        fears.add(new Phobia("randomphobia", 1));
        // subclasses instances can be part of super class data structures fear.feel();
        phobia.feel();


        fears.get(0).feel();
        System.out.println("=======\n");

        AbstractionImplementation abstraction = new AbstractionImplementation();
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        
        // Exceptions.Start();
        // Lambdas.Start();
        // Records.Start();
        try {
            FAnnotations.Start();
        } catch(Exception e) {
            System.out.println(e.getCause());
        }
        
        for(Field field : fear.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(FieldAnnotation.class)) {
                try {
                    Object value = field.get(fear);
                    if(value instanceof String valueToString) {
                        System.out.println(valueToString.toUpperCase());
                    }
                } catch(IllegalAccessException e) {
                    System.out.println(e.getCause());
                }
            }
        }

        // Enumerations.Start();
        Reflection.Start();
    }

    public static void test(String message) {
        System.out.println(message);
    }

}
