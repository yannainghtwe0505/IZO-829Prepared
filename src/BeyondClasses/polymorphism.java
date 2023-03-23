package BeyondClasses;

class Penguin {
    public int getHeight() {
	return 3;
    }

    public void printInfo() {
	System.out.print(this.getHeight());
    }
}

public class polymorphism extends Penguin {
    public static void main(String[] fish) {
	new polymorphism().printInfo();
    }

    @Override
    public int getHeight() {
	return 8;
    }
}