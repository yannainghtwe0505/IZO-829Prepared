
public class Tank {
    private boolean empty;
    public static float code = 1.2f;

    public static void main(String[] args) {
        // System.out.println("" + empty);
        var Public = 3;
        System.out.println(~Public);
        // int c = 20;
        System.out.println();
        System.out.println(code);
        var num1 = Long.parseLong("100");
        var num2 = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));
        int numKnives;
        System.out.print("""
                "# forks = " + numForks +
                   # knives = " + numKnives +
                # cups = 0""");
        // var a = 2_234.0_0;
        System.out.println();
        var blocky = """
                squirrel \s
                pigeon \
                termite""";

        // System.out.println(numKnives);
        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1
        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0
        System.out.println(2 / 2);
        System.out.println(2 % 2);
        // System.out.println(11 / 0);
        short w = 14;
        float x = 13;
        double y = 10;
        int tadpole = (int) 5L + 2;
        byte z = (byte) (w + 10);
        System.out.println(z);
        System.out.println(tadpole);
        String test1 = new String("bu");
        String test2 = new String("bu");
        System.out.println(test1 == test2);
        test1 = test2;
        System.out.println(test1 instanceof String);
        System.out.println("================");
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;
        System.out.println(zooTime instanceof Number);
        System.out.println(zooTime instanceof Object);
        System.out.println(obj instanceof Number);
        openZoo(2l);
        System.out.println();
        var a1 = true;
        var a2 = false;
        System.out.println(a1 && a2);
        System.out.println(a1 & a2);
        System.out.println(a1 | a2);
        System.out.println(a1 || a2);
        System.out.println(a1 ^ a2);
        String d1 = "Hi";
        String d2 = "HI";
        String d3 = d1.toUpperCase();
        System.out.println(d3 == d2);
        boolean b = true;
        byte apples = 5;
        long oranges = 10;
        long ear = 2;
        short height = 1, weight = 3;
        double note = 1 * 2 + (float) 3;
        int sample3 = 5 * (1 % 2);
        short melody = (byte) (note *= 2);
        float aa = 0.3f;
        int start = (byte) (Byte.MAX_VALUE + 1);
        long goat = 2;
        goat -= 1.0;
        System.out.println(start);
        int aa = 2, bb = 4, c = 2;
        System.out.println(aa > 2 ? --c : b++);
        System.out.println(b = (aa != c ? aa : b++));
        System.out.println(aa > b ? b < c ? b : 2 : 1);

        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber;
        int plane = -myFavoriteNumber;
        var superman = bird == plane ? 5 : 10;
        boolean a = true;
        boolean b = !a;
        boolean c = a;
        int aa = 2;
        int bb = ++aa;
        int cc = aa;
        int dd = aa++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=========");
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
        System.out.println(aa);
        // System.out.println(bird + "," + plane + "," + --superman);
    }

    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print(time + " O'clock");
        else
            System.out.print(time);
    }
}
