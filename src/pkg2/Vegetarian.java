package pkg2;

public interface Vegetarian {

    default void eat() {
        System.out.println("Eat Veg");
    }
}