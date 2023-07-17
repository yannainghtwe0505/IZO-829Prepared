package Classes;

public class constructorTest {

}

class Elephant extends Mammal {
    Elephant() {
    } // DOES NOT COMPILE
}

class Mammal {
    Mammal(int age) {
    }
}

class Seal extends Mammal {
} // DOES NOT COMPILE