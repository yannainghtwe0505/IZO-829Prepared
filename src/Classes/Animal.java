package Classes;

public class Animal {
    static {
	System.out.print("A");
    }
    private int age;
    protected String name;

    public int getAge() {
	return age;
    }

    public void setAge(int newAge) {
	age = newAge;
    }
}
