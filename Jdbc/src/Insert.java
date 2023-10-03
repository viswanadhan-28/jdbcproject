import java.sql.*;
public class Insert {
	public static void main(String[] args)throws Exception {
		insertData();
	}
public static void insertData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/java_connectivity";
	String username="root";
	String password="2001";
	String Query ="insert into jdbc values(?,?,?,)";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,"vishwa");
	pst.setInt(2, 22);
	pst.setString(3,"email");
	pst.executeUpdate();
	con.close();
	}}
	/*public static void main(String[] args)throws Exception {
		getData();
	}
public static void getData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/jdbc";
	String username="root";
	String password="2001";
	String Query ="Select *from jdbc";
	Connection con=DriverManager.getConnection(url,username,password);
	Statement pst=con.createStatement();
	ResultSet rst=pst.executeQuery(Query);
	while(rst.next()) {
		System.out.println("name"+rst.getString(1));
		System.out.println(rst.getInt(2));
		System.out.println(rst.getString(3));
	}
	con.close();}*/
	


/*public static void updatedata()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/java";
	String username="root";
	String password="2305";
	int id=23;
	String Query="update employee set NAME ='nisha' where ID=23";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}*/
