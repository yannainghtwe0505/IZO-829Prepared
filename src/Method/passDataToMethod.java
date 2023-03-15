package Method;

public class passDataToMethod {
    public static void main(String[] args) {
	int num = 4;
	newNumber(num);
	System.out.print(num); // 4
	String myname = "koko";
	myString(myname);
	System.out.println(myname);
    }

    public static void myString(String myname) {
	myname = "Mg Mg";
    }

    public static void newNumber(int num) {
	num = 8;
    }

    public void var() {
    }
}
