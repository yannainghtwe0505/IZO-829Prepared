package BeyondClasses;

public class BadCasts {
    public static void main(String[] args) {
	Wolf2 wolfy = new Wolf2();
	Dog badWolf = (Dog) wolfy;
    }
}

interface Canine {
}

interface Dog {
}

class Wolf implements Canine {
}