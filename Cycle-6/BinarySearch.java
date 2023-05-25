import java.util.Scanner;

class BinarySearch {
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
	int n,x;
	Scanner input = new Scanner(System.in);
	int arr[] = new int[50];
	System.out.print("Enter the size of array : ");
	n = input.nextInt();
	System.out.println("Enter the array");
	for(int i=0;i<n;++i){
	arr[i] = input.nextInt();
	}
	System.out.print("Enter the element to search : ");
	x = input.nextInt();
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
    }

