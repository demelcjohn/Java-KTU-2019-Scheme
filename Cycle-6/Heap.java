import java.util.Scanner;

public class Heap
{
static void sort(int a[],int n)
{
int i,temp;
for(i=n/2-1;i>=0;i--) 
	insertheap(a,n,i);
for(i=n-1;i>=0;i--)
{
	temp = a[0];
	a[0] = a[i];
	a[i] = temp;
	insertheap(a,i,0);
}
}

static void insertheap(int a[],int n,int i)
{
int large=i, l=2*i+1,r=2*i+2,temp;
if(l<n&& a[l]>a[large])
	large=l;
if(r<n && a[r]>a[large])
	large=r;
if (large!=i)
{
	temp = a[i];
	a[i] = a[large];
	a[large] = temp;
	insertheap(a,n,large);
}
}

static void printArray(int a[],int n)  
{
int i;
for(i=0;i<n;++i)
	System.out.print(a[i]+ " ");
}
  
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int a[] = new int[20];
int n;
System.out.println("Heap Sort");
System.out.print("Enter the size of array : ");
n = input.nextInt();
System.out.print("Enter the array : ");
for(int i=0;i<n;++i)
	a[i] = input.nextInt();
sort(a,n);
System.out.print("Sorted array :");
printArray(a,n);
System.out.println();
}
}
 
 
 
 
 
 
 
 
 
 
