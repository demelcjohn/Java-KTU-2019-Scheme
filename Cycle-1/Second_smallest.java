import java.util.Scanner;

public class Second_smallest{
  public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);

	int a[] = new int[100];
	System.out.println("Second smallest element in an array");
	System.out.print("Enter the size of array : ");
	int n=input.nextInt();
	
	if(n>1)
	{
  		System.out.print("Enter the array elements : ");
  		for(int i=0;i<n;++i)
    			a[i] = input.nextInt();
  		int small,ps;
		int sec_small,pss;
		if(a[0]<a[1]){
			small=a[0];
			ps=0;
			sec_small=a[1];
			pss=1;
		}
		else{
			ps=1;
			pss=0;
			small=a[1];
			sec_small=a[0];
		}
		for(int i=2;i<n;++i){
			  if(a[i]<sec_small){
 				   if(a[i]<small){
 					     sec_small=small;
 					     pss=ps;
 					     small=a[i];
 					     ps=i;
				    }
 				   else{
 					   sec_small=a[i];
 					   pss=i;
				    }
				}
		}
		pss++;
		System.out.println("The second smallest element is " + sec_small + " at " + pss +"th position");
		}
	else
		System.out.println("Not possible");
}}
