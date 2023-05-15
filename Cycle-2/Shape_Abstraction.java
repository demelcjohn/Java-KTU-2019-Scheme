abstract class Shape {
	int no_sides;
    	abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
	    System.out.println("Number of sides of rectangle is 4");
	}
}

class Triangle extends Shape{
    void numberOfSides(){
	    System.out.println("Number of sides of triangle is 3");
	}
}

class Hexagon extends Shape{
    void numberOfSides(){
	    System.out.println("Number of sides of hexagon is 6");
	}
}

public class Shape_Abstraction{
	public static void main(String[] args){

	Shape rec = new Rectangle();
	Shape tri = new Triangle();
	Shape hex = new Hexagon();
	System.out.println("Number of Sides using Abstraction");
	rec.numberOfSides();
	tri.numberOfSides();
	hex.numberOfSides();
	
    }
}
