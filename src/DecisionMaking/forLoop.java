package DecisionMaking;

public class forLoop {
    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x + " ");
        for (x = 4; x < 5; x++) // DOES NOT COMPILE
            System.out.println(x + " ");
        int c = 0;

        for (; c < 5; c++) // DOES NOT COMPILE
            System.out.print(c + " ");
        int a[] = { 1, 2, 3, 4, 5 };
        for (int b : a) {
            System.out.println();
        }
        int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
        for (int[] mySimpleArray : myComplexArray) {
            // for (int i = 0; i < mySimpleArray.length; i++) {
            // System.out.print(mySimpleArray[i] + "\t");
            // }
            for (int col : mySimpleArray) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
