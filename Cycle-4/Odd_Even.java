class DisplayNumbers{
	synchronized void num(int n){
	if(n==0)
	System.out.println("Even numbers");
	else
	System.out.println("Odd numbers");
	for(int i=1;i<=100;++i){
		if(i%2==n){
			System.out.print(i + " ");
			try{
				Thread.sleep(50);
				}catch(Exception e){System.out.println(e);}
		if(i%10==0||i%10==9)
			System.out.println();	

		}
	}
	System.out.println();
	}

}

class MyThread extends Thread{  
DisplayNumbers obj;
int n;
MyThread(DisplayNumbers obj,int n){
this.obj = obj;
this.n = n;
}
public void run(){
obj.num(n);
}  
}  

  
public class Odd_Even{  
public static void main(String args[]){
System.out.println("Odd and even numbers using Threads\n");  
DisplayNumbers obj = new DisplayNumbers();
MyThread t1=new MyThread(obj,1);  
MyThread t2=new MyThread(obj,0);  
t1.start();
t2.start();
}  
}  






