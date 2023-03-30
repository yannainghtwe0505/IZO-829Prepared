package BeyondClasses;

public class hiding extends penguin {
    public static int getHeight() {
	return 8;
    }

    public static void main(String... fish) {
	new hiding().printInfo();
    }
}

class penguin {
    public static int getHeight() {
	return 3;
    }

    public void printInfo() {
	System.out.println(this.getHeight());
    }
}