package BeyondClasses;

class Cobra extends Snake {
}

class GardenSnake extends Cobra {
}

abstract class Snake {
}

public class SnakerHandler {
    public static void main(String[] args) {
	new SnakerHandler().setSnake(null);
    }

    private Snake snakey;

    public void setSnake(Snake mySnake) {
	this.snakey = mySnake;
    }
}