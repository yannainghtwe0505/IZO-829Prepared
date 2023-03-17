package Classes;

public class Lion extends Animal {
    public static void main(String[] args) {
	var lion = new Lion();
	lion.setProperties(3, "kion");
	lion.roar();
    }

    public void roar() {
	System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }

    protected void setProperties(int age, String n) {
	setAge(age);
	name = n;
    }
}