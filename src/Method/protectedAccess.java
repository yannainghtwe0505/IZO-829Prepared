package Method;

import fundamental.Car;

public class protectedAccess extends Car {
    public static void main(String[] args) {
	System.out.println();
	packageAccess pk = new packageAccess();
//	new Car().noisy();
	pk.noise = "noisy";
//	Car a=new Car();
    }

    public void play() {
	System.out.println(number);
    }

}
