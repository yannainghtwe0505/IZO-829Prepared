package pkg2;

public class Bird implements Vegetarian {

    @Override
     public void eat() {
        System.out.println("Eat Something");
    }

    public static void main(String[] args) {
        Bird racoon = new Bird();
        racoon.eat();
    }
}