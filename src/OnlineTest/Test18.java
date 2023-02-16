package OnlineTest;

import java.io.FileNotFoundException;

public class Test18 {

    private static void testData() throws FileNotFoundException {
        try {
            System.out.println("TheCertificationGuide");
            throw new FileNotFoundException();
        } catch (Exception ex) {
            ex = null; // Line 11
            throw ex; // Line 12
        }
    }

    public static void main(String[] args) {
        try {
            testData(); // Line 18
        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception");
        }
    }
}