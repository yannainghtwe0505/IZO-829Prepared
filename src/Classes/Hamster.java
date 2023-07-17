package Classes;

public class Hamster {
    public static void main(String[] args) {
	Hamster ha = new Hamster(0);
	System.out.println(ha.color);
    }

    private String color;

    private int weight;

    public Hamster(int weight) { // Second constructor
	this(weight, "brown");
    }

    public Hamster(int weight, String color) { // First constructor
	this.weight = weight;
	this.color = color;
    }
}