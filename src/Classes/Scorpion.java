package Classes;

class Arachnid {
    static StringBuilder sb = new StringBuilder();
    static {
	sb.append("u");
    }
    {
	sb.append("c");
    }
    {
	sb.append("r");
    }
}

public class Scorpion extends Arachnid {
    static {
	sb.append("q");
    }

    public static void main(String[] args) {
	System.out.print(Scorpion.sb + " ");
	System.out.print(Scorpion.sb + " ");
	new Arachnid();
	new Scorpion();
	System.out.print(Scorpion.sb);
    }

    {
	sb.append("m");
    }
}