class Shape 
{
	public Shape() {
		super();
		System.out.println("constructor in class shape executed");
	}
}

class Rectangle extends Shape
{
	public Rectangle() {
		super();
		System.out.println("constructor in class rectangle executed");
	}
}

class Square extends Rectangle
{
	public Square() {
		super();
		System.out.println("constructor in class square executed");
	}
}

public class Source
{
	public static void main(String... args) {
		Square obj = new Square();
	}
}
