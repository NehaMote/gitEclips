package jdbc_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sit","root","root");
	String sql ="insert into student (rollno,name,email,addr) values(103,'vijay','vijay@gmail.com','pune')";
	
	Statement smt = con.createStatement();
	boolean execute = smt.execute(sql);
	System.out.println(execute+" Save Data");
	
}
}
