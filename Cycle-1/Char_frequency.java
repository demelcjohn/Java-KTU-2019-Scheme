import java.util.Scanner;

public class Char_frequency{
public static void main(String arg[]){

	Scanner input = new Scanner(System.in);
	int i;
	int count = 0;
	System.out.println("Character Frequency");
	System.out.print("Enter the string : ");
	String word = input.nextLine();
	System.out.print("Enter the character to be counted : ");
	char letter = input.next().charAt(0);
	
	for(i=0;i<word.length();++i){
	if(word.charAt(i)==letter){
	  count++;
	}
	}
	if(count==0)
	  System.out.println("The character is not present.");
	else
	  System.out.println(letter +" is present " + count + " time(s) in " + word);
}
}
