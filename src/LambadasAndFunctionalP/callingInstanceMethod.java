package LambadasAndFunctionalP;
interface StringStart{
	boolean beginningCheck(String prefix);
}
interface StringEmpty{
	boolean check();
}
public class callingInstanceMethod {
	public static void main(String[] args) {
		var str="zoo";
		StringStart methodref=str::startsWith;
		StringStart lambada=s->str.startsWith(s);
		System.out.println(methodref.beginningCheck("zo"));
		
		
		StringEmpty methodref2=str::isEmpty;
		StringEmpty lambada2=()->str.isEmpty();
	}

}
