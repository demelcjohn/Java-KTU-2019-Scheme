import java.io.*;
 
import java.util.Scanner; 
 
public class FileException {
public static void main(String[] args) {
System.out.println("File to read and write");
try{
try {
	FileWriter myWriter = new FileWriter("File1.txt");
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the text");
	String s = input.nextLine();
	myWriter.write(s); 
 
	myWriter.close(); 
	System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
}
try {
	File myObj = new File("File1.txt");  
	System.out.println("The file contains : ");
	Scanner myReader = new Scanner(myObj);
	while (myReader.hasNextLine()) {
	String data = myReader.nextLine();
	System.out.println(data);
	}
	myReader.close();
} catch (FileNotFoundException e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
}
}catch(Exception e){
	System.out.println("An error occurred.");
	e.printStackTrace();

}
}
}
