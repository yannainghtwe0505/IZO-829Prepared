package CoreApi;

public class arrayTest {
	public static void main(String[] args) {
		int b;
		int []num=new int[3];
		int[] moreNumbers = new int[] {42, 55, 99};
//		System.out.println(num.e);
		for(int n:num) {
			System.out.println(n);
		}
		int[]a,c;
		a= new int[4];
		c=new int[3];
		System.out.println(a);
		 String[] strings = { "stringValue" };
		 Object[] objects = strings;
		 String[] againStrings = (String[]) objects;
//		 againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//		 objects[0] = new StringBuilder();

		 int a1[]= {1,2,3};
		 int a2[]= {1,2,3};
		 System.out.println(a1.equals(a2));
		 var string = "12345";
		 System.out.println(string.length());
		 
	}

}
