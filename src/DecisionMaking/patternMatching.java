package DecisionMaking;

public class patternMatching {
    public static void main(String[] args) {
        compareIntegers(20);
    }

    static void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.print(data.compareTo(5));
        }
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
        System.out.print(data);
        System.out.print(data + 2);

    }

}
