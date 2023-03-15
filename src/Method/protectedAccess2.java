package Method;

public class protectedAccess2 extends protectedAccess {
	public void play() {
		System.out.println(number);
	}

	public static void main(String[] args) {
		protectedAccess pa=new protectedAccess();
		protectedAccess2 pa2=new protectedAccess2();
		pa2.number=20;
//		pa.number=20;

	}

}
