import java.util.Scanner;

public class Matrix_multiplication{

public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	int a[][]=new int[20][20];
	int b[][]=new int[20][20];
	int c[][]=new int[20][20];
	int r1,r2,c1,c2;
	System.out.println("Matrix Multiplication");
	System.out.print("Enter the number of rows and columns of matrix A : ");
	r1=input.nextInt();
	c1=input.nextInt();
	System.out.print("Enter the number of rows and columns of matrix B : ");
	r2=input.nextInt();
	c2=input.nextInt();
	if(c1==r2){
	System.out.println("Enter the elements of matrix A : ");
	for(int i=0;i<r1;++i){
		for(int j=0;j<c1;++j)
			a[i][j]=input.nextInt();
	}
	System.out.println("Enter the elements of matrix B : ");
	for(int i=0;i<r2;++i){
		for(int j=0;j<c2;++j)
			b[i][j]=input.nextInt();
	}
	System.out.println("A*B");
	for(int i=0;i<r1;i++){
		for(int j=0;j<c2;j++){
			c[i][j]=0;
			for(int k=0;k<c1;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
			}
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	}
	else{
	System.out.println("Not possible");
	}
}}




















