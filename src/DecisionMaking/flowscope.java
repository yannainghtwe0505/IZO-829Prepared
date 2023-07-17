package DecisionMaking;

public class flowscope {
    public static void main(String[] args) {
        printOnlyIntegers(3);
        test(1);
    }

    static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
        System.out.print(data.intValue());
    }

    public static void test(int animal) {
        switch (animal) {
        case 1:
        case 2:
            System.out.print("Lion");
        case 3:
            System.out.print("Tiger");
        }
    }
}
