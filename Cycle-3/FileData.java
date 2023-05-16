import java.io.*;
 
import java.util.Scanner; 
 
public class FileData {
public static void main(String[] args) {
System.out.println("\nDisplay number of characters , words and lines in a file");

try {
	int i,c=0,w=0,l=0;
	File myObj = new File("File2.txt");  
	Scanner myReader = new Scanner(myObj);
	System.out.println("\nThe text contains : ");
	while (myReader.hasNextLine()) {
		l++;
		String data = myReader.nextLine();
		System.out.println(data);
		for(i=0;i<data.length();++i)
		{
			if(data.charAt(i)==' ')
				w++;
		}
		w++;
		c=c+i;
	}
	c=c-w+l;
	myReader.close();
	System.out.println("\nThe text file contains " + c + " characters, " + w + " words and " + l + " lines\n");
} catch (FileNotFoundException e) {
	System.out.println("An error occurred.");
	e.printStackTrace();
}

}
}
