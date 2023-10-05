import java.sql.*;
public class Deleteflightsdata {
	public static void main(String[] args)throws Exception {
		DeleteData();	}

public static void DeleteData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	int flight_id=345627;
	String Query="delete from flights where flight_id=345627 ";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst= con.prepareStatement(Query);
	int rows =pst.executeUpdate();
	System.out.println("rows");
	con.close();
	}}


