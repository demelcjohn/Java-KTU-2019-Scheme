import java.io.*;
 
import java.util.Scanner; 
 
public class FileWR {
public static void main(String[] args) {

	try {
	System.out.println("File to read and write");			//Writing to file operation
	FileWriter myWriter = new FileWriter("File1.txt");
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the text");
	String s = input.nextLine();
	myWriter.write(s); 
	myWriter.close(); 
	System.out.println("Successfully wrote to the file.");
	} catch (Exception e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
	}
	
	try {	
	FileReader myReader = new FileReader("File1.txt");  		//Reading from file operation
	System.out.println("The file contains : ");
	int i;
	while((i=myReader.read())!=-1)
		System.out.print((char)i);
	System.out.println();
	myReader.close();
	} catch (Exception e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
	}

}
}
