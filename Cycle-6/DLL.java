public class DLL {

Node head; 
 
class Node {
int data;
Node prev;
Node next;
 
Node(int d) { data = d; }
}
 
   
 
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
 
        Node last = head; 
 
        new_node.next = null;
 
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
 
        while (last.next != null)
            last = last.next;
 
        last.next = new_node;
 
        new_node.prev = last;
    }
 
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
 
    public static void main(String[] args)
    {
     
        DLL dll = new DLL();
 
        dll.push(6);
 
       
  
 
        dll.push(4);
 
 
        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
    }
