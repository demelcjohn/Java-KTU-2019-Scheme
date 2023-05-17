import java.io.*;
 
import java.util.Scanner; 
 
public class FileLine {
public static void main(String[] args) {
System.out.println("Display contents in ordered manner from file");

try {
	int i=1;
	File myObj = new File("File2.txt");  
	System.out.println("The file contains : ");
	Scanner myReader = new Scanner(myObj);
	while (myReader.hasNextLine()) {
		String data = myReader.nextLine();
		System.out.println(i +". "+ data);
		++i;
	}
	myReader.close();
} catch (FileNotFoundException e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
}

}
}
