package fundamental;

public class UseIandS {

	public static void main(String[] args) {
		InstanceAndStatic is = new InstanceAndStatic();
		is.inum = 20;
		is.show();
		InstanceAndStatic.snum = 40;
		InstanceAndStatic.sShow();
		
		InstanceAndStatic is2 = new InstanceAndStatic();
		is2.inum=300;
		is2.show();
	}

}
