package Classes;

class Orca extends Whale {
    static public int MAX = 3;

    @Override
    public void dive() {
	System.out.println("Orca diving");
    }

    @Override
    public void dive(Number depth) {
	System.out.println("Orcadiving deeper " + MAX);
    }
}

public abstract class Whale {
    public static void main(String[] args) {
	Whale whale = new Orca();
	whale.dive(3);
    }

    public abstract void dive();

    public void dive(Number a) {
	System.out.println("I love you");
    }
}