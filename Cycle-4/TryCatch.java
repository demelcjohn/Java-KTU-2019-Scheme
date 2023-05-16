import java.io.*;

public class TryCatch{

	static void func() throws ArrayIndexOutOfBoundsException{
		int a[] = new int[5];
		a[5] = 10;
	}
	public static void main(String args[]){
		System.out.println("Try - Catch - Throws - Finally");
		int a,b;
		try{
			System.out.println("a = 0 and b = 100/0");
			a = 0;
			b = 100/a;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e){
			System.out.println("Error! Division by 0 not possible");
			try{
				func();
			}catch(ArrayIndexOutOfBoundsException f){
				System.out.println("Exception in function func");
			}
		}
		catch(Exception e){
			System.out.println("Error!! ");
		}
		finally{
			System.out.println("Code in finally block");
		}
		
	}
}
