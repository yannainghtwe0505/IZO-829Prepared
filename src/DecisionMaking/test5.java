package DecisionMaking;

public class test5 {
    public static void main(String[] args) {
        char[] wolf = { 'W', 'e', 'b', 'b', 'y' };

        int q = wolf.length;
        for (;;) {
            System.out.print(wolf[--q]);
            if (q == 0)
                break;
        }

    }

}
