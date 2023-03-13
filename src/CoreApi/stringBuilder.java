package CoreApi;

public class stringBuilder {
	public static void main(String[] args) {
		 StringBuilder a = new StringBuilder("abc");
		 StringBuilder b = a.append("de");
		 b = b.append("f").append("g");
		 System.out.println("a=" + a);
		 System.out.println("b=" + b);

		 //creaet string builder in three ways
		 StringBuilder sb1 = new StringBuilder();
		 StringBuilder sb2 = new StringBuilder("animal");
		 StringBuilder sb3 = new StringBuilder(10);
		 String sb4="";
		 System.out.println(sb1.equals(sb1));


		System.out.println("------Append-------");
		int aa[]= {1,2,3};
		var sb = new StringBuilder().append(aa).append('c');
		sb.append("-").append(true);
		System.out.println(sb); // 1c-true

		System.out.println("------Insert---------");
		var s = new StringBuilder("animals");
		s.insert(7, "-"); // sb = animals-
		s.insert(0, "-"); // sb = -animals-
		s.insert(4, "-0"); // sb = -ani-mals-
		System.out.println(s);

		System.out.println("-------delete-------");
		var sbd = new StringBuilder("abcdef");
		sbd.delete(1, 100); // sb = adef
		System.out.println(sbd);
//		sbd.deleteCharAt(5); // exception

		System.out.println("------builder---------");
		var builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 100, "sty");
		System.out.println(builder); // pigsty dirty
		var string = "12345";
		string.replace('3'	, 'd');

	}
	// Create a new StringBuilder object with an initial capacity of 16 characters
//	StringBuilder sb = new StringBuilder();
//
//	// Append a string to the end of the current sequence
//	public StringBuilder append(String str);
//
//	// Insert a string at a specified position in the current sequence
//	public StringBuilder insert(int offset, String str);
//
//	// Delete a sequence of characters from the current sequence
//	public StringBuilder delete(int start, int end);
//
//	// Replace a sequence of characters with a new string
//	public StringBuilder replace(int start, int end, String str);
//
//	// Return the length of the current sequence
//	public int length();
//
//	// Return the capacity of the current sequence
//	public int capacity();
//
//	// Convert the current sequence to a string
//	public String toString();

}
