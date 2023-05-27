package LambadasAndFunctionalP;
interface EmptyStringCreator{
	String create();
}
interface copyString{
	String copy(String text);
}
public class callingConstructor {
	static EmptyStringCreator methodref=String::new;
	EmptyStringCreator lambada=()->new String();
	public static void main(String[] args) {
		var myString=methodref.create();
		System.out.println(myString.equals(null));
		copyString methodRef=String::new;
		copyString lambada2=(s)->new String(s);
		System.out.println(methodRef.copy("Hello"));
		
	}
	
}
