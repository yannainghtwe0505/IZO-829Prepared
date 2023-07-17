package Method;

public class staticModifier {
    private static final int NUM_BUCKETS = 45;
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
	treats[0] = "popcorn";
	treats[0] = "bubu";
	System.out.println(treats[0]);
    }

}
