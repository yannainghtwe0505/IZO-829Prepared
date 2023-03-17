package Classes;

public class JavanRhino extends Rhino {

    @Override
    public CharSequence getColor() { // DOES NOT COMPILE
	return "grey";
    }

    @Override
    public String getName() {
	return "javan rhino";
    }
}

class Rhino {
    protected String getColor() {
	return "grey, black, or white";
    }

    protected CharSequence getName() {
	return "rhino";
    }
}