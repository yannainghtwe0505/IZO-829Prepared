package OnlineTest;

class Person {
    public Double greet() {
        return 30.0;
    }

    public Object greet() {
        return "thank you";
    }
}

public class Test30 {
    public static void main(String[] args) {
        Person person = new Person();
        String hello = person.greet();
        Object thank = person.greet();
        System.out.println(String.join(":", hello, (String) thank));
    }
}