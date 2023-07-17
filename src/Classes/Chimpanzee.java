package Classes;

class Ape extends Primate {
    public Ape() {
	System.out.print("Ape2-");
    }

    public Ape(int fur) {
	System.out.print("Ape1-");
    }
}

public class Chimpanzee extends Ape {
    public static void main(String[] args) {
	new Chimpanzee();
    }

    public Chimpanzee() {
	super(2);
	System.out.print("Chimpanzee-");
    }
}

class Primate {
    public Primate() {
	System.out.print("Primate-");
    }
}