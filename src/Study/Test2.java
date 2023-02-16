package Study;

public class Test2 {
    public static void main(String[] args) {
        final int score1 = 8, score2 = 3;
        char myScore = 7;
        switch (myScore) {
        case 1, 2, 4:
            System.out.println();
            ;
        default:
            System.out.println("Hi");
            ;
        }
        ;
        var goal = switch (myScore) {
        default -> "unknown";
        case score1 -> "great";
        case 2, 4, 6 -> "good";
        case 3, 5 -> "bad";
        };
        System.out.println(goal);
    }
}
