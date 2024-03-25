package app;

public class Phobia extends Fear {
    Phobia(String name, int level) {
        super(name, level);
    };
    
    @Override
    @VeryImportant
    public void feel() {
        System.out.printf("Feeling phobia %s \n", this.getName());
    }
    
    @VeryImportant
    public void notFeel() {
        System.out.printf("Not Feeling phobia %s \n", this.getName());
    }
}
