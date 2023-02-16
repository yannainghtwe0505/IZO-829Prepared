package OnlineTest;

public class Test2 {

    public static void main(String[] args) {
        // StringBuilder stringBuilder = new StringBuilder("Certification");
        // List<StringBuilder> testList = new ArrayList<>();
        // testList.add(new StringBuilder("Hi"));
        // testList.add(stringBuilder);
        // stringBuilder.append("hu");
        // System.out.println(testList);
        Test5.main(args);
        StringBuilder sb = new StringBuilder("Certification ");
        String s = sb.toString() + (sb.append("Guide "));
        sb.append("hi");
        System.out.println(s.strip());
        System.out.println(s.strip().length());
    }
}