import java.sql.*;
public class Updatereservation {
	public static void main(String[] args)throws Exception {
		updateData();
	}
	public static void updateData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	int RESERVATION_ID = 456378923;
	String Query="update reservations set PASSENGER_NAME= 'BOOMIKAA'  where RESERVATION_ID= 456378923";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();}}


