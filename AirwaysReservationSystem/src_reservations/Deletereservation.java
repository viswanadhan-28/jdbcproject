import java.sql.*;
public class Deletereservation {
	public static void main(String[] args)throws Exception {
		DeleteData();	}

public static void DeleteData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	String PASSENGER_NAME= "BOOMIKAA";
	String Query= "delete from reservations where PASSENGER_NAME= 'BOOMIKAA'";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst= con.prepareStatement(Query);
	int rows =pst.executeUpdate();
	System.out.println("rows");
	con.close();
	}}


