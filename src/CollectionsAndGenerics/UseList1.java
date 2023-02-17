package CollectionsAndGenerics;

import java.util.ArrayList;

public class UseList1 {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Doctor");
		arrList.add("Engineer");
		arrList.add("Nurse");
		arrList.add("Police");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("***change array value in index 0***");
		arrList.set(0, "Hacker");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("==============Adding Data================");
		arrList.add(0, "Programmer");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("==============Use for each=================");
		for (String s : arrList) {
			System.out.println(s);
		}

	}

}
