package app;
public class Fear {

    @FieldAnnotation
    private String name;
    private int level = 0;
    private static int fearsCreated = 0;

    public Fear(String name, int level) {
        this.name = name;
        this.level = level;
        Fear.fearsCreated++;
    };

	public void feel() {
        System.out.printf("Feeling %s\n", this.name);
    };
    
    @Override
    public String toString() {
        return String.format("Fear: %s | Level: %d", this.name, this.level);
    }

    public String getName() { return this.name; }

    public void stickInYourAss() {
        String sentence = String.format("Sticking fear in your ass");
        System.out.println(sentence);
    }
};
