import java.sql.*;
public class Updateflightsdata {
	public static void main(String[] args)throws Exception {
		updateData();
	}
	public static void updateData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	int flight_id =275020;
	String Query="update flights set DEPARTURE_CITY ='CHENNAII' where flight_ID=275020";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();}}

