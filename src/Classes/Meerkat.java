package Classes;

class aa extends Carnivore {

    @Override
    protected void hide() {
	// TODO Auto-generated method stub

    }

}

abstract class Carnivore {
    public static void aaa() {
    }

    protected boolean hasFur = false;

    abstract void hide();

}

public class Meerkat extends Carnivore {
    public static void main(String[] args) {
	Meerkat m = new Meerkat();
	Carnivore c = new Meerkat();
	System.out.println(m.hasFur); // true
	System.out.println(c.hasFur); // false
    }

    protected boolean hasFur = true;

    @Override
    protected void hide() {
	// TODO Auto-generated method stub

    }
}