package BeyondClasses;

enum enumTes {
    Htwe, Naing, Yan;

}

public class enumTest {
    public static void main(String[] args) {
	for (var name : enumTes.values()) {
	    System.out.println(name.name() + "-" + name.ordinal());
	}
    }
}
