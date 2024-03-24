package app;

public class Cat implements IPrintable {
    public String name;
    public int age;

    public Cat() {}

	@Override
	public void print() {
        System.out.println("Meow");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
