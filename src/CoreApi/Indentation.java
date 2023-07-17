package CoreApi;

public class Indentation {
	public static void main(String[] args) {
		System.out.print("Hello\rWorld");
		System.out.println();

		 var block = """
					  a
					    b
					 c""";
		 var concat = " a\n"
					+ "  b\n"
				    + " c";
	 System.out.println(block.length()); // 6
	 System.out.println(concat.length()); // 9
	 
	 System.out.println("---------------");
	 System.out.println(block.indent(1).length()); // 12
	 System.out.println(block.indent(0).length()); // 9
	 System.out.println(block.indent(-1).length()); // 7
	 System.out.println(block.stripIndent().length());

	 System.out.println("--------------------");

	 System.out.println(concat.indent(1).length());
	 System.out.println(concat.indent(0).length());
	 System.out.println(concat.indent(-1).length()); // 7
	 System.out.println(concat.indent(-4).length()); // 6
	 System.out.println(concat.stripIndent().length()); // 6
	}

}
