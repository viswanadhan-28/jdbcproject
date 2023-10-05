import java.sql.*;
public class Getreservation {
	 public static void main(String[] args)throws Exception {
	getData();
}
public static void getData()throws Exception{
String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
String username="root";
String password="2001";
String Query ="Select *from reservations";
Connection con=DriverManager.getConnection(url,username,password);
Statement pst=con.createStatement();
ResultSet rst=pst.executeQuery(Query);
while(rst.next()) {
	System.out.println("RESERVATION_ID= "+rst.getInt(1));
	System.out.println("PASSENGER_NAME= "+rst.getString(2));
	System.out.println("FLIGHT_ID= "+rst.getInt(3));
	System.out.println("SEAT_NUMBER= "+rst.getInt(4));
	System.out.println("RESERVATION_DATE= "+rst.getString(5));
	
}
con.close();}}


