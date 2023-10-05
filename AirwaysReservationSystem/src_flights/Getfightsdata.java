import java.sql.*;
public class Getfightsdata {
	 public static void main(String[] args)throws Exception {
	getData();
}
public static void getData()throws Exception{
String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
String username="root";
String password="2001";
String Query ="Select *from flights";
Connection con=DriverManager.getConnection(url,username,password);
Statement pst=con.createStatement();
ResultSet rst=pst.executeQuery(Query);
while(rst.next()) {
	System.out.println("FLIGHT_ID= "+rst.getInt(1));
	System.out.println("FLIGHT_NUMBER= "+rst.getString(2));
	System.out.println("DEPARTURE_CITY= "+rst.getString(3));
	System.out.println("ARRAIVAL_CITY= "+rst.getString(4));
	System.out.println("DEPARTURE_DATE= "+rst.getString(5));
	System.out.println("DEPARTURE_TIME= "+rst.getString(6));
	System.out.println("ARRAIVAL_DATE= "+rst.getString(7));
	System.out.println("ARRAIVAL_TIME= "+rst.getString(8));
	System.out.println("AVAILABLE_SEATS= "+rst.getInt(9));
	System.out.println("TICKET_PRICE= "+rst.getString(10));
}
con.close();}}


