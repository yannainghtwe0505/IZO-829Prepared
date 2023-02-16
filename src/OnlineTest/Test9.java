package OnlineTest;

public class Test9 {

    public static void main(String[] args) {
        Clock[] clocks = new Clock[5]; // Line c2
        for (Clock obj : clocks) {
            obj.timer++; // Line c3
        }
        System.out.println(Clock.timer); // Line c4
    }
}