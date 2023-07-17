package BeyondClasses;

class Beetle extends Insect {
    @Override
    int getNumberOfLegs() {
	return 6;
    }

    int getNumberOfSections(int count) {
	return 1;
    }
}

public interface implementextend {

    double size = 2.0f;

    abstract int getNumberOfSections();
}

abstract class Insect implements implementextend {
    abstract int getNumberOfLegs();
}