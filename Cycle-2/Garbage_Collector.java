    public class Garbage_Collector{  
     public void finalize(){System.out.println("Object is garbage collected");}  
     public static void main(String args[]){  
      Garbage_Collector object1 = new Garbage_Collector();  
      Garbage_Collector object2 = new Garbage_Collector();  
      System.out.println("Garbage Collection Demo");
      object1 = object2;  
      object2 = null;  
      System.gc();  
     }  
    }  
