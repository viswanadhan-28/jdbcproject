import java.sql.*;
public class Flights {
	public static void main(String[] args)throws Exception {
		insertData();
	}
public static void insertData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airways_authority";
	String username="root";
	String password="2001";
	String Query ="insert into flights values(?,?,?,?,?,?,?,?,?,?)";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1,345627);
	pst.setString(2, "GFD435");
	pst.setString(3,"TINDIVANAM");
	pst.setString(4, "PERUMBAKAM");
	pst.setString(5, "16-11-1945");
	pst.setString(6,"02:40");
	pst.setString(7, "21-08-1978");
	pst.setString(8, "11:33");
	pst.setInt(9, 200);
	pst.setString(10, "14000");
	pst.executeUpdate();
	con.close();
	}} 



