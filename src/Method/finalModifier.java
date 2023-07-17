package Method;

public class finalModifier {
    public void zooAnimalCheckup(boolean isWeekend) {
	final int rest;
	if (isWeekend)
	    rest = 5;
	else
	    rest = 20;
	System.out.print(rest);
//		final var giraffe = new Animal();
	final int[] friends = new int[5];
	rest = 10; // DOES NOT COMPILE
//		giraffe = new Animal(); // DOES NOT COMPILE
	friends = null; // DOES NOT COMPILE
    }

    public String zooFriends() {
	final String name = "Harry the Hippo";
	var size = 10;
	final boolean wet;
	if (size > 100)
	    size++;
	name.substring(0);
	wet = true;
	return name;
    }
}
