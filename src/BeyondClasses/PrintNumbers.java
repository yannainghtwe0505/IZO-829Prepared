package BeyondClasses;

public class PrintNumbers {
    public static void main(String[] args) {
	var printer = new PrintNumbers();
	printer.calculate(); // 100
    }

    private int length = 5;

    public void calculate() {

	int width = 20;
	class Calculator {

	    public void multiply() {
		System.out.print(length * width);
	    }
	}
	length = 40;
	var calculator = new Calculator();
	calculator.multiply();
    }

    public void processData() {
	final int length = 5;
	int width = 10;
	int height = 2;
	class VolumeCalculator {
	    public int multiply() {
		return length * width * height; // DOES NOT COMPILE
	    }
	}
//	width = 2;
    }
}