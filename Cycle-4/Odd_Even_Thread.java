  
class MyThread1 extends Thread{  
public void run(){  
	for(int i=1;i<=100;++i){
		if(i%2==1){
			System.out.print(i + " ");
			if(i%10==9)
				System.out.println();
			try{
				Thread.sleep(100);
				}catch(Exception e){System.out.println(e);}
		}
	}
}  
}  

class MyThread2 extends Thread{  
public void run(){  
for(int i=1;i<=100;++i){
		if(i%2==0){
			System.out.print(i + " ");
			try{
				Thread.sleep(150);
				}catch(Exception e){System.out.println(e);}
		}
	}
	System.out.println();
}  
}
  
public class Odd_Even_Thread{  
public static void main(String args[]) throws Exception{
System.out.println("Odd and even numbers using Threads");  
MyThread1 t1=new MyThread1();  
MyThread2 t2=new MyThread2();  
t1.start();
t1.join();
t2.start();
}  
}  
