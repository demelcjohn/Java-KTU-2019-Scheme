import java.io.*;
 
import java.util.Scanner; 
 
public class FileNoExcep {
public static void main(String[] args) {
try{
	try{
	System.out.println("File to read and write");			//Writing to file operation
	BufferedWriter myWriter = new BufferedWriter(new FileWriter("File3.txt"));
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the text");
	String s = input.nextLine();
	myWriter.write(s); 
	myWriter.close(); 
	System.out.println("Successfully wrote to the file.");
	}catch(IOException e){
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	
	try{
	BufferedReader myReader = new BufferedReader(new FileReader("File3.txt"));  		//Reading from file operation
	System.out.println("The file contains : ");
	String line;
	while((line=myReader.readLine())!=null)
	System.out.println(line);
	myReader.close();
	}catch(FileNotFoundException e){
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
}catch(Exception e){
	System.out.println("An error occurred.");
	e.printStackTrace();
}
}
}
