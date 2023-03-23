package BeyondClasses;

public class polymorphism extends PPenguin {
    public static void main(String[] fish) {
	new polymorphism().printInfo();
    }

    @Override
    public int getHeight() {
	return 8;
    }
}

class PPenguin {
    public int getHeight() {
	return 3;
    }

    public void printInfo() {
	System.out.print(this.getHeight());
    }
}