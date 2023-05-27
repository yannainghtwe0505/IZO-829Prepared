package LambadasAndFunctionalP;
interface onParameter{
	boolean check(String input);
}
public class callingInstanceOnParameter {
	static onParameter methodref=String::isEmpty;
	onParameter lambada=s->s.isEmpty();
	public static void main(String[] args) {
		System.out.println(methodref.check(null));
	}
}
