package Classes;

class Mammal {
    public Mammal() {
    }

    public Mammal(int age) {
	System.out.print("Mammal");
    };

    private void sneeze() {
    }
}

public class Platypus extends Mammal {
    public static void main(String[] args) {
	new Mammal(5);
    }

    public Platypus() {

	System.out.print("Platypus");
    }

    int sneeze() {
	return 1;
    }
}
