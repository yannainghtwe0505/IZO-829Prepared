package BeyondClasses;

interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public static void main(String[] args) {
	Lemur lemur = new Lemur();
//	Object o=Lemur;
	System.out.println(lemur.age);
	HasTail hasTail = lemur;
	System.out.println(hasTail.isTailStriped());
	Primate primate = lemur;
	System.out.println(primate.hasHair());
//	Lemur l = (Lemur) primate;
//	System.out.println(primate.hasHair());
    }

    public int age = 10;

    @Override
    public boolean hasHair() {
	return false;
    }

    @Override
    public boolean isTailStriped() {
	return false;
    }
}

class Primate {
    public boolean hasHair() {
	return true;
    }
}