import java.util.Scanner;

class Employee {
	String name;
	int age; 
	String phone_number;
	String address; 
	float salary;

    void printSalary(){
        System.out.println("Salary: "+salary);
    }
}

class Officer extends Employee{
    String specialisation;
}

class Manager extends Employee{
    String department;
}

public class Inheritance{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	Officer officer1 = new Officer();
	Manager manager1 = new Manager();
	
	System.out.println("Employee Details\n");
        System.out.println("Enter details of Officer");
        System.out.print("Name : ");
        officer1.name = scan.nextLine();
        System.out.print("Age : ");
        officer1.age = scan.nextInt();
        scan.nextLine();
        System.out.print("Phone number : ");
	officer1.phone_number = scan.nextLine();
        System.out.print("Address : ");
        officer1.address = scan.nextLine();
        System.out.print("Salary : ");
        officer1.salary = scan.nextFloat();
        scan.nextLine();
        System.out.print("Specialisation : ");
        officer1.specialisation = scan.nextLine();

        System.out.println("\nEnter details of Manager");
        System.out.print("Name : ");
        manager1.name = scan.nextLine();
        System.out.print("Age : ");
        manager1.age = scan.nextInt();
        scan.nextLine();
        System.out.print("Phone number : ");
        manager1.phone_number = scan.nextLine();
        System.out.print("Address : ");
        manager1.address = scan.nextLine();
        System.out.print("Salary : ");
        manager1.salary = scan.nextFloat();
        scan.nextLine();
        System.out.print("Department : ");
        manager1.department = scan.nextLine();

        System.out.print("\nOFFICER \n");
        System.out.println("Name : " + officer1.name);
        System.out.println("Age : " + officer1.age);
        System.out.println("Phone number : " + officer1.phone_number);
        System.out.println("Address : " + officer1.address);
        System.out.println("Specialisation : " + officer1.specialisation);
        officer1.printSalary();
        
        System.out.print("\nMANAGER \n");
        System.out.println("Name: " + manager1.name);
        System.out.println("Age: " + manager1.age);
        System.out.println("Phone number: " + manager1.phone_number);
        System.out.println("Address: " + manager1.address);
        System.out.println("Department : " + manager1.department);
        manager1.printSalary();
    }
}
