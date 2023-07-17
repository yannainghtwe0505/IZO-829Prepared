package Classes;

abstract class Canine {
    public void bark() {
        System.out.println(getSound());
    }

    public abstract String getSound();
}

class Coyote extends Canine {
    @Override
    public String getSound() {
        return "Roar!";
    }
}

class Fox extends Canine {
    @Override
    public String getSound() {
        return "Squeak!";
    }
}

public class Wolf extends Canine {
    public static void main(String[] args) {
        Wolf w= new Wolf();
        w.bark();
    }

    @Override
    public String getSound() {
        return "Wooooooof!";
    }
}