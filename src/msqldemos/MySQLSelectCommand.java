package msqldemos;
/*
1)create a connection
2)Create statement/query
3)Execute statement/query
4)Store data in resultset
5)Close connection
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;

public class MySQLSelectCommand {

	public static void main(String[] args) throws SQLException {
		//1)Create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//2)Create statement/query
		Statement stmt=con.createStatement();
		
		String s="Select SNO,SNAME,Marks from student";
		//3,4)Execute statement/Query and store in resultset
		
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next())
		{
			int eid=rs.getInt("SNO");
			String fname=rs.getString("SNAME");
			int marks=rs.getInt("MARKS");
			
			System.out.println(eid+" "+fname+" "+marks);
		}
		//4)Close connection
		con.close();
		System.out.println("Query Executed.....");
	}

}
