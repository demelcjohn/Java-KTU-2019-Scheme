import java.util.Scanner;

public class Prime_number{

public static void main(String arg[]){

	Scanner input = new Scanner(System.in);
	System.out.println("Prime Number Checker");
	System.out.print("Enter a number : ");
	int num=input.nextInt();
	boolean flag =false;
	for(int i=2;i<num/2;++i){
	  if(num%i==0){
	    flag=true;
	    break;
	  }
	}
	if(flag)
  		System.out.println(num + " is not a prime number .");
	else
		System.out.println(num + " is a prime number .");
	
}
}
