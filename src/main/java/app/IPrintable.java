package app;

@FunctionalInterface
public interface IPrintable {
    // when an interface has exactly one abstract method, it is called a functional interface
    
    // abstract method
    void print(String suffix);
}
