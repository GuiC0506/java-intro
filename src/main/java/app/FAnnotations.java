package app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
public class FAnnotations {

    public static void Start() throws InvocationTargetException, IllegalAccessException {
        System.out.println(FAnnotations.class.isAnnotationPresent(VeryImportant.class));

        Phobia phobia = new Phobia("tassalophobia", 3);
        for(Method method : phobia.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(VeryImportant.class)) {
                method.invoke(phobia);
            }
        }
    }
    
    public static String anything() {
        return "Anything";
    }
}
