package app;
public class Fear { private String name;
    private int level = 0;
    static int fearsCreated = 0;

    public Fear(String name, int level) {
        this.name = name;
        this.level = level;
        Fear.fearsCreated++;
    };

    public void feel() {
        System.out.printf("Feeling %s\n", this.name);
    };

    public static int getFearsCreated() {
        return Fear.fearsCreated;
    }
    
    @Override
    public String toString() {
        return String.format("Fear: %s | Level: %d", this.name, this.level);
    }

    public String getName() { return this.name; }
};
