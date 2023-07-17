package BeyondClasses;

enum enumTes {
    Htwe, Naing, Yan

}

public class enumTest {
    public static void main(String[] args) {
	for (var season : enumTes.values()) {
	    System.out.println(season.name() + "-" + season.ordinal() + season);

	}
	System.out.println(enumTes.values());
	Season summer = Season.SUMMER;
	switch (summer) {
	case WINTER:
	    System.out.print("Get out the sled!");
	    break;
	case SUMMER:
	    System.out.print("Time for the pool!");
	    break;
	default:
	    System.out.print("Is it summer yet?");
	}
    }
}
