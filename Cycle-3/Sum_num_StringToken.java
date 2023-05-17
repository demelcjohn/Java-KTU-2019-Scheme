import java.util.StringTokenizer;
import java.util.Scanner;

public class Sum_num_StringToken{
public static void main(String args[]){
int sum=0;
Scanner input= new Scanner(System.in);
System.out.println("Enter a list of numbers with space");
String list = input.nextLine();
StringTokenizer num = new StringTokenizer(list," ");
System.out.println("The integers are");
while(num.hasMoreTokens()){
int n = Integer.parseInt(num.nextToken());
sum = sum +n;
System.out.println(n);
}
System.out.println("Sum of given integers : " + sum );
}}

