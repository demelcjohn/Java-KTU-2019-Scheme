import java.util.StringTokenizer;

class Display_Msg{  
	synchronized void display(String msg){ 
		StringTokenizer splitmsg = new StringTokenizer(msg," ");
		while(splitmsg.hasMoreTokens()){
			System.out.print(splitmsg.nextToken() + "+");
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}
		}  
		System.out.println("Ended");
	}  
}  
  
class MyThread extends Thread{  
Display_Msg obj;
String msg;  
MyThread(Display_Msg obj,String msg){  
this.msg = msg;  
this.obj = obj;
}  
public void run(){  
obj.display(msg);  
}  
  
}  

  
public class Synchronization_Eg{  
public static void main(String args[]){
System.out.println("Synchronization Example");  
Display_Msg obj = new Display_Msg();
MyThread t1=new MyThread(obj,"Java is a programming language");  
MyThread t2=new MyThread(obj,"Orange and apple are fruits");  
t1.start();
t2.start();
}  
}  
