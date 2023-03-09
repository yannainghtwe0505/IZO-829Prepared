package CoreApi;

public class addressCheck {
	public static void main(String[] args) {
		String name=new String("name");
		String name2=new String("name");
		System.out.println(name==name2);
		System.out.println(name.hashCode()==name2.hashCode());
		System.out.println(name2.hashCode());
	}
}
