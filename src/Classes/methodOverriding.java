package Classes;

class BactrianCamel extends Camel {
    @Override
    int getNumberOfHumps() { // DOES NOT COMPILE
	return 2;
    }
}

class Camel {
    int getNumberOfHumps() {
	return 1;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
	Camel c = new BactrianCamel();
	System.out.print(c.getNumberOfHumps()); // ???
    }
}