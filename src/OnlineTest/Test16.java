package OnlineTest;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int[] array1 = { 4, 11, 10 };
        int[] array2 = { 0, 20, 10 };
        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.compare(array1, array2) + Arrays.mismatch(array1, array2));
    }

}
