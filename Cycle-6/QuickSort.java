import java.io.*;
import java.util.Scanner;
 
class QuickSort{
     
static void swap(String[] arr, int i, int j)
{
	String temp = new String();
	 temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
 
static int partition(String[] arr, int low, int high)
{
     
    String pivot = arr[high];
     int i = (low - 1);
    for(int j = low; j <= high - 1; j++)
    {  
        if (arr[j].compareTo(pivot)<0)
        { 
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
 
static void quickSort(String[] arr, int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
 
static void printArray(String[] arr, int size)
{
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
         
    System.out.println();
}
 
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Quick sort");
    System.out.print("Enter the number of strings : ");
    int n = input.nextInt();
    String[] arr = new String[20];
    System.out.print("Enter strings : \n");
    input.nextLine();
    for(int i=0;i<n;++i){
    	arr[i] = input.nextLine();
     }
    quickSort(arr, 0, n -1);
    System.out.println("Sorted array: ");
    printArray(arr, n);
}
}
 
