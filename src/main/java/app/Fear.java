package app;
public class Fear {

    @FieldAnnotation
    public String name;
    private int level = 0;
    static int fearsCreated = 0;

    public Fear(String name, int level) {
        this.name = name;
        this.level = level;
        Fear.fearsCreated++;
    };

    public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}


	public void feel() {
        System.out.printf("Feeling %s\n", this.name);
    };
    
    @Override
    public String toString() {
        return String.format("Fear: %s | Level: %d", this.name, this.level);
    }

    public String getName() { return this.name; }
};
