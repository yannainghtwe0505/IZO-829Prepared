package LambadasAndFunctionalP;

interface testfn {
	boolean test2(String a);

}

public class funInter {
	static void fntest(int a,int b,testfn c) {
		System.out.println(c.test2("hello"+(a+b)+"")); 
	}
	static void fntest2(testfn c) {
		System.out.println(c.test2(c.toString()));
	}

	public static void main(String[] args) {
//		System.out.println((String a)->a.sta);
		System.out.println("hi");
	fntest(1,2,a->a.startsWith("hello"));
	fntest2(a->true);
	}

}
