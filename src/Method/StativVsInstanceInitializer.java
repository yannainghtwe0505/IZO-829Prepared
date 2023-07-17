package Method;

public class StativVsInstanceInitializer {
    static String stName;
    static {
	stName = "bu";
    }

    public static void main(String[] args) {
	StativVsInstanceInitializer sI = new StativVsInstanceInitializer();
	System.out.println(sI.name);
	System.out.println(stName);
    }

    String name;

    {
	name = "hi";
    }

}
