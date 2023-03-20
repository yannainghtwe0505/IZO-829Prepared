package BeyondClasses;

public enum Season {
    FALL("Medium"), SPRING("Medium"), SUMMER("High"), WINTER("Low");

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
	this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
	System.out.println(expectedVisitors);
    }
}