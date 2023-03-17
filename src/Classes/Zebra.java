package Classes;

public class Zebra extends Animal {
    public Zebra() {
	this(4); // Refers to constructor in Zebra with int argument
    }

    public Zebra(int age) {
	super(); // Refers to constructor in Animal
    }

    public Zebra(int age,int y) {
	this()
    }
}