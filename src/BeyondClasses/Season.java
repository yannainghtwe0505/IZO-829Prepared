package BeyondClasses;

public enum Season {
    FALL("Medium"), SPRING("Medium"), SUMMER("High"), WINTER("Low", 4);

    public static void main(String[] args) {
	Season.SUMMER.printExpectedVisitors();
	System.out.println(Season.SPRING);
	var a = Season.WINTER;
	System.out.println(a);
    }

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
	System.out.println("b");
	this.expectedVisitors = expectedVisitors;
    }

    private Season(String expectedVisitors, int age) {
	this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
	System.out.println(expectedVisitors);
    }
}