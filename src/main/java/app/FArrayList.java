package app;
import java.util.*;

public class FArrayList {
    public static void Start() {
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("test")
        );
        // they store reference data type
        list.add("churros");
        list.add("shoyuou");

        System.out.println(list.get(0));
        System.out.println(list.size());

        list.set(1, "getulio");
        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list.get(0));

        list.clear();
        System.out.println(list.size());
    }
}
