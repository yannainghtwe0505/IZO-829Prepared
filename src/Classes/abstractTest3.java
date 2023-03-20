package Classes;

public class abstractTest3 extends Nocturnal {

    public static void main(String[] args) {
	var nocturnal = (Nocturnal) new abstractTest3();
	System.out.println(nocturnal.isBlind());
    }

    @Override
    public boolean isBlind() {
	// TODO Auto-generated method stub
	System.out.println("Hwllo");
	return false;
    }

}

abstract class Nocturnal {
    abstract boolean isBlind();
}