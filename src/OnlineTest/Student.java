package OnlineTest;

abstract class Main {
    public String fname = "John";
    public int age = 24;

    public abstract void study();

    public void gg() {
        System.out.println("bubu");
    }// abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    @Override
    public void gg() {

    }

    public int graduationYear = 2018;

    @Override
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }

}
