import java.io.*;

class MyException extends Exception{
	void getMsg(){
	System.out.println("User defined exception MyException");}
}

public class UserException{

	public static void main(String args[]){
	try{
		System.out.println("User defined Exception");
		throw new MyException();
	}catch(MyException e){
		System.out.println("Error caught");
		e.getMsg();
	}
		
		
	}
}
