import java.util.Scanner;

public class Reverse_string{
  public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	String rev="";
	System.out.println("Reverse a string");
	System.out.print("Enter the string : ");
	String word = input.nextLine();
	for(int i = word.length()-1 ;i >=0;--i){
	  rev = rev + word.charAt(i);
	}
	rev = rev + '\0';
	System.out.println("The reversed string is " + rev);
}
}
