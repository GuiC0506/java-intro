package app;
import app.Fear;

public class Phobia extends Fear {
    Phobia(String name, int level) {
        super(name, level);
    };
    

    public void feel() {
        // super.feel();
        System.out.printf("Feeling phobia %s \n", this.getName());
    }
};
