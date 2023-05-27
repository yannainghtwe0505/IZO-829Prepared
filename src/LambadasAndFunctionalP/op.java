package LambadasAndFunctionalP;
interface operation{
	int perform(int x,int y);
	
}
public class op {
	public static int plus(int x, int y, operation op) {
		return op.perform(x, y);
	}
public static void main(String[] args) {
	int result=plus(2,4,(a,b)->a+b);
	System.out.println(result);
}
}
