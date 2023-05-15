import java.util.Scanner;
import java.lang.Math;

public class Area_finder{

	static double area(float r){ return 3.14*r*r; }
	
	static double area(float l,float b){ return l*b;}
	
	static double area(float a,float b,float c){
		float s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));}

	public static void main(String arg[]){
	
		Scanner input = new Scanner(System.in);
		int choice;
		float x,y,z;
		double ar;
		
		System.out.println("Area Finder");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("(Choice more than 3 to exit)");
		do{
		System.out.print("Select the shape : ");
		choice = input.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter the radius of circle");
				x = input.nextFloat();
				ar = area(x);
				System.out.println("The area of circle is " + ar);
				break;
			case 2:
				System.out.println("Enter the length and breadth of rectangle");
				x = input.nextFloat();
				y = input.nextFloat();
				ar = area(x,y);
				System.out.println("The area of rectangle is " + ar);
				break;
			case 3:
				System.out.println("Enter the length of sides of triangle");
				x = input.nextFloat();
				y = input.nextFloat();
				z = input.nextFloat();
				ar = area(x,y,z);
				System.out.println("The area of triangle is " + ar);
				break;
			default:
				System.out.println("Thank you..!!!");
				break;
		}
		}while(choice<=3);
	}
}
		
		
		
		
