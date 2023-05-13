import java.util.Scanner;

public class Palindrome{
public static void main(String arg[]){

	Scanner input= new Scanner(System.in);
	int i,j;
	System.out.println("Palindrome Checker");
	System.out.print("Enter a string : ");
	String word = input.nextLine();
	int l = word.length();
	for(i=0,j=l-1;i<l/2;++i,--j){
	if(word.charAt(i)!=word.charAt(j))
	  break;
	}
	if(i==l/2)
	  System.out.println(word + " is palindrome");
	else
	  System.out.println(word + " is not palindrome");
}
}
