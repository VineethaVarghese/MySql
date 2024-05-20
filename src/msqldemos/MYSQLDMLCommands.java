package msqldemos;
/*
1)create a connection
2)Create statement/query
3)Execute statement/query
4)Close connection
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		//1)Create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//2)Create statement/query
		Statement stmt=con.createStatement();
		
		String s="INSERT INTO STUDENT VALUES(106,'JJ',25,'')";
		//3)Execute statement/Query
		stmt.execute(s);
		
		//4)Close connection
		con.close();
		System.out.println("Query Executed.....");
	}

}
