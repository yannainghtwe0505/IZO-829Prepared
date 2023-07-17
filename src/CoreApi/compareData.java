package CoreApi;

import java.util.Arrays;

public class compareData {
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {3,2,1};
		System.out.println(Arrays.compare(arr1, arr2));
		System.out.println("----------------");
		System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
		System.out.println(Arrays.mismatch(new String[] {"a"},
		new String[] {"A"}));
		System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));
	}
}
