import java.util.Scanner;

public class DoublyLinkedList{

Node Head; 
 
class Node {
int data;
Node prev;
Node next;
 
Node(int d) { data = d; }
}
 
void insert(int x)
{
Node new_node = new Node(x);
new_node.next = null;
if (Head == null) {
	new_node.prev = null;
	Head = new_node;
	return;
}
Node ptr = Head;
while (ptr.next != null)
	ptr = ptr.next;
ptr.next = new_node;
new_node.prev = ptr;
}
 
void delete(int x)
{
Node ptr = Head;
while(ptr != null)
{
if(ptr.data==x)
	break;
ptr = ptr.next;
}
if(ptr==null){
	System.out.println("Element not present");
	return;
}
ptr.prev.next = ptr.next;
ptr.next.prev = ptr.prev;
System.out.println("Element deleted!!");
}

public void display()
{
Node ptr = Head;
while (ptr != null) {
	System.out.print(ptr.data + " ");
	ptr = ptr.next;
}
System.out.println();
}
 
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
DoublyLinkedList dll = new DoublyLinkedList();
int choice,x;
System.out.println("Doubly Linked List");
System.out.println("1 Insert");
System.out.println("2 Delete");
System.out.println("3 Display");
do{
System.out.print("Enter the choice : ");
choice = input.nextInt();
switch(choice)
{
	case 1:
		System.out.print("Enter the element to be inserted : ");
		x = input.nextInt();
		dll.insert(x);
		break;
	case 2:
		System.out.print("Enter the element to be deleted : ");
		x = input.nextInt();
		dll.delete(x);
		break;
	case 3:
		System.out.println("List : ");
		dll.display();
		break;
}
}while(choice<4);
}
}













