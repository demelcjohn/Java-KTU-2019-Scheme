interface  Bird_Fly{
   void fly();
}

interface  Bird_Eat{
   void eat();
}

class Bird implements Bird_Fly, Bird_Eat{
   public void fly() {
      System.out.println("Bird is flying");
   }
   public void eat() {
      System.out.println("Bird is eating");
   }
}

public class Interface_Inheritance{
   public static void main(String arg[]){
   
     Bird b1 = new Bird();
     System.out.println("Interface Inheritance");
     System.out.println("Activities of bird");
     b1.fly();
     b1.eat();
     
	}
}
