package BeyondClasses;

public class Home {
    protected class Room { // Inner class declaration
	private static void greet(String message) {
	    System.out.println(message);
	}

	public int repeat = 3;

	public void enter() {
	    for (int i = 0; i < repeat; i++)
		greet(greeting + i);
	}
    }

    public static void enterRoom2() { // Instance method in outer class
	var room = new Home().new Room(); // Create the inner class instance
	room.enter();

    }

    public static void main(String[] args) {
	var home = new Home(); // Create the outer class instance
	home.enterRoom();
	var room = home.new Room();
	room.enter();
    }

    private String greeting = "Hello"; // Outer class instance variable

    public void enterRoom() { // Instance method in outer class
	var room = new Room(); // Create the inner class instance
	room.enter();

    }
}