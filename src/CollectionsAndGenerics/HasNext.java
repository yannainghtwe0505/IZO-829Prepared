package CollectionsAndGenerics;

import java.util.Scanner;

public class HasNext {

	public static void main(String args[]) {
		//Create Scanner object  
		Scanner scan = new Scanner("Hello World!");
		//Printing the delimiter used  
		System.out.println("Delimiter:" + scan.delimiter());
		//Print the Strings  
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		//Close the scanner  
		scan.close();
	}
}
