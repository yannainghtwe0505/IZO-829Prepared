package BeyondClasses;

public class Orangutan {
    public static void main(String[] bananas) {
	final Primate x = (pi) new Orangutan();
	System.out.println(x.age);
    }

    protected int age = 4;

    {
	age = 5;
    }

    public Orangutan() {
	this.age = 6;
    }
}

class pi {
    protected int age = 2;
    {
	age = 1;
    }

    public pi() {
	this.age = 3;
    }
}