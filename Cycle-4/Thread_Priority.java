import java.lang.*;
class MyThread extends Thread{  
public void run(){
	System.out.println("Run function working ,thread : "+Thread.currentThread().getName());
	}
}  

  
public class Thread_Priority{  
public static void main(String args[]){
System.out.println("Thread Priorities");  
MyThread t1 = new MyThread();
MyThread t2 = new MyThread();  
System.out.println("Initial priority of thread 1 : " + t1.getPriority());
System.out.println("Initial priority of thread 2 : " + t2.getPriority());
t1.setPriority(3);
t2.setPriority(8);
System.out.println("Final priority of thread 1 : " + t1.getPriority());
System.out.println("Final priority of thread 2 : " + t2.getPriority());
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());    
Thread.currentThread().setPriority(1);  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  
