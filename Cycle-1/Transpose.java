import java.util.Scanner;

public class Transpose{

public static void main(String args[]){

Scanner input = new Scanner(System.in);

int Mat[][]=new int[20][20];
int Tra[][]=new int[20][20];
int r,c;

System.out.println("Matrix Transpose");
System.out.print("Enter the number of rows and columns of matrix  : ");
r=input.nextInt();
c=input.nextInt();
System.out.println("Enter the elements of matrix : ");
for(int i=0;i<r;++i){
for(int j=0;j<c;++j)
Mat[i][j]=input.nextInt();
}

System.out.println("Given Matrix");
for(int i=0;i<r;++i){
for(int j=0;j<c;++j){
System.out.print(Mat[i][j] + " ");
}
System.out.println();
}

for(int i=0;i<r;++i){
for(int j=0;j<c;++j){
Tra[j][i]=Mat[i][j];
}
}

System.out.println("Transpose Matrix");
for(int i=0;i<c;++i){
for(int j=0;j<r;++j){
System.out.print(Tra[i][j] + " ");
}
System.out.println();
}
}
}
