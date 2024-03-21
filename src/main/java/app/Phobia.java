package app;
import app.Fear;

public class Phobia extends Fear {
    Phobia(String name, int level) {
        super(name, level);
    };
    
    @Override
    public void feel() {
        System.out.printf("Feeling phobia %s \n", this.getName());
    }
}
