package Method;

public class varArgs {
    public static void main(String[] args) {
	walkDog(1);
	walkDog(1, 2);
	walkDog(1, 2, 3);
	walkDog(1, new int[] { 4, 5 });
	walkDog(1, null);
	walkDog(1, null);
    }

    public static void walkDog(int start, int... steps) {
	System.out.println(steps.length);
    }
}
