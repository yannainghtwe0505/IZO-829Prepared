package Classes;

public class MouseHouse {

    public static void main(String[] args) {
	MouseHouse m = new MouseHouse();
	System.out.println(m.type);
    }

    private final String type;

    private final int volume;

    {
	this.volume = 10;
    }

    // public MouseHouse() { // DOES NOT COMPILE
//	this.volume = 2; // DOES NOT COMPILE
//
//    }
    public MouseHouse() { // DOES NOT COMPILE
	this(null);
    }

    public MouseHouse(String type) {
	this.type = type;
    }

}