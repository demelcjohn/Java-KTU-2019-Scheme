import java.sql.*;
class StudentData{
public static void main(String args[]){
	try{
	System.out.println("Student Database");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Password123#@!");
	Statement myStatement=con.createStatement();
	ResultSet myResultSet=myStatement.executeQuery("Select * from student");
	while(myResultSet.next()){
		System.out.println("Roll no: "+ myResultSet.getInt("Rollno")+", Name: "+myResultSet.getString("Name")+", Percentage: "+myResultSet.getFloat("Percentage"));
	} 
	System.out.println("Data displayed");
	con.close();
	}catch(Exception e){
	e.printStackTrace();}
}
}
