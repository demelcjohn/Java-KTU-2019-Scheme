import java.io.*;
 
import java.util.Scanner; 
 
public class FileWR {
public static void main(String[] args) throws Exception {

	System.out.println("File to read and write");			//Writing to file operation
	FileWriter myWriter = new FileWriter("File5.txt");
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the text");
	String s = input.nextLine();
	myWriter.write(s); 
	myWriter.close(); 
	System.out.println("Successfully wrote to the file.");
	
	FileReader myReader = new FileReader("File5.txt");  		//Reading from file operation
	System.out.println("The file contains : ");
	int i;
	while((i=myReader.read())!=-1)
	System.out.print((char)i);
	myReader.close();

}
}
