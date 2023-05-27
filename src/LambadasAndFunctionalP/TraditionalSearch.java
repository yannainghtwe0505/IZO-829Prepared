package LambadasAndFunctionalP;

import java.util.ArrayList;
import java.util.List;

class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
	return a.canHop();
    }
}

interface CheckTrait {
    boolean test(Animal a);
}
interface test{
	boolean mytest(String a);
}
record Animal(String species, boolean canHop, boolean canSwim) {
}

public class TraditionalSearch {
    public static void main(String[] args) {

	var animals = new ArrayList<Animal>();
	animals.add(new Animal("fish", false, true));
	animals.add(new Animal("kangaroo", true, false));
	animals.add(new Animal("rabbit", true, false));
	animals.add(new Animal("turtle", false, true));

	// pass class that does check
//	boolean a=()->true;
//	var invalid = (Animal a) -> a.canHop();
  
	print(animals, b ->{ return !b.canSwim();});
	print(animals, new CheckIfHopper());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
	for (Animal animal : animals) {

	    if (checker.test(animal))
		System.out.print(animal + " ");
	}
	System.out.println();
    }
}