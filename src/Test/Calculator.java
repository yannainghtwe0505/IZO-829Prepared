package Test;

import java.util.Scanner;

abstract class Shape {
    private String color;

    abstract double getArea();

    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
	super();
	this.radius = radius;
    }

    @Override
    double getArea() {
	return 3.14 * (radius * 2);
    }

    @Override
    double perimeter() {
	return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
	super();
	this.length = length;
	this.width = width;
    }

    @Override
    double getArea() {
	return length * width;
    }

    @Override
    double perimeter() {
	return 2 * length * width;
    }
}

public class Calculator {
    public static void main(String[] args) {
	// Use StringBuilder append for readability
	StringBuilder initMsg = new StringBuilder();
	initMsg.append("Welcome to Area and Perimeter Calculator. \n");
	initMsg.append("Enter the radius of the circle:\n");
	System.out.println(initMsg);
	try (Scanner sc = new Scanner(System.in);) {// to close scanner automatically
	    double radius = sc.nextDouble();

	    System.out.println("Enter the width of the rectangle:");
	    double width = sc.nextDouble();

	    System.out.println("Enter the height of the rectangle:");
	    double height = sc.nextDouble();

	    Circle circle = new Circle(radius);
	    System.out.println("Area of circle: " + circle.getArea());
	    System.out.println("Perimeter of circle: " + circle.perimeter());

	    Rectangle rectangle = new Rectangle(height, width);
	    System.out.println("Area of rectangle: " + rectangle.getArea());
	    System.out.println("Perimeter of rectangle: " + rectangle.perimeter());

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

}
