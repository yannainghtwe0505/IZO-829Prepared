package Method;

public class InstanceVariableModifier {
    public class PolarBear {
	final int age = 10;
	final int fishEaten;
	final String name;
	{
	    fishEaten = 10;
	}

	public PolarBear(String a) {
	    name = a;
	}
    }

}
