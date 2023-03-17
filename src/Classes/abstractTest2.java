package Classes;

public class abstractTest2 {

}

class BlackRhino extends Rhino {
    @Override
    void eatLeaf() {} // Inherited from Mammal
}

abstract class Mammal {
    abstract void eatLeaf();

    abstract void showHorn();
}

abstract class Rhino extends Mammal {
    @Override
    void showHorn() {} // Inherited from Mammal
}