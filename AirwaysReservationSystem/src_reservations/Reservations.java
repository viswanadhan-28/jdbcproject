import java.sql.*;
public class Reservations {
	public static void main(String[] args)throws Exception {
		insertData();
	}
public static void insertData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	String Query ="insert into reservations values(?,?,?,?,?)";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1,435676578);
	pst.setString(2, "ADHITHYAN");
	pst.setInt(3,2345);
	pst.setInt(4, 129);
	pst.setString(5, "13-09-1887");
	pst.executeUpdate();
	con.close();
	}} 


