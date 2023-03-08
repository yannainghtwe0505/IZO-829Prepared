package BuildingBlock;

import java.util.Date;
import java.util.Random;

public class Animal {// top level type

    String name;
    int b = 1_10;
    static Integer bu = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int myname = 0;
    public static int a = 0;

    public static void main(String[] args) {

        System.out.println("hee");
        Random r = new Random();
        Date d = new Date();
        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
        System.out.println(eyeTest);
        String block1 = """
                doe \
                deer""";
        String block = """
                doe \n
                deer
                """;

        String block3 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println(block);
        System.out.println(block1);
        System.out.println();
        System.out.println(block3);

    }

    public void run() {
        a = 40;
        name = "Hi";
        System.out.println(name);
    }
}
