package InterfaceTest;

public interface Vegetarian {

    default void eat() {
        System.out.println("Eat Veg");
    }
}