package OnlineTest;

public class Test17 {
    public static void main(String[] args) {
        int l = 10;
        int c = 20;
        switch (c) {
        case 20: {
            l *= 2;
            System.out.println("I is " + l);
        }
        case 30: {
            l *= 3;
            System.out.println("I is " + l);
        }
        case 40: {
            l *= 4;
            System.out.println("I is " + l);
        }
        }
        System.out.println(l);
    }
}