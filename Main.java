package labPrograms;

public class Main {
	 public static void main(String[] args) {
	 Circle circle = new Circle(7); // Instantiating
	 Square square = new Square(9);
	 Rectangle rectangle = new Rectangle(4, 8);
	 System.out.println("Circle Area: " + circle.getArea());
	 
	 System.out.println("Square Area: " + square.getArea());
	 
	 System.out.println("Rectangle Area: " + rectangle.getArea());
	 }
	}