
import java.lang.Math;

class Square extends Thread{
int n;
Square(int n){
this.n = n;
}
public void run(){
int s;
s = n*n;
System.out.println("Square : " + s);


}
}


class Cube extends Thread{
int n;
Cube(int n){
this.n = n;
}
public void run(){
int c;
c = n*n*n;
System.out.println("Cube : " + c);

}
}

class RandomNumber extends Thread{
	public void run(){
	try{
	for(int i=0;i<10;++i){
		int n = (int)(Math.random()*100);
		System.out.println("Number generated : " + n);
		if(n%2==0){
			Square sq = new Square(n);
			sq.start();
		}
		else{
			Cube cu = new Cube(n);
			cu.start();
		}
		Thread.sleep(1000);
	}
}catch(Exception e){
	System.out.println(e);
}
}
}

public class ThreadHandling{
public static void main(String args[]){
	RandomNumber obj1 = new RandomNumber();
	obj1.start();	
}
}




