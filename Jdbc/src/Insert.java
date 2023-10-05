import java.sql.*;
public class Insert {
	public static void main(String[] args)throws Exception {
		insertData();
	}
public static void insertData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/java_connectivity";
	String username="root";
	String password="2001";
	String Query ="insert into jdbc values(?,?,?,?)";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,"kanan");
	pst.setInt(2, 23);
	pst.setString(3,"email@gami.com");
	pst.setInt(4, 23);
	pst.executeUpdate();
	con.close();
	}} 

	
	
	
	
	 /*public static void main(String[] args)throws Exception {
		getData();
	}
public static void getData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/java_connectivity";
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
	con.close();}}
	



	
	public static void main(String[] args)throws Exception {
		updateData();
	}
	public static void updateData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/java_connectivity";
	String username="root";
	String password="2001";
	int age =22;
	String Query="update jdbc set NAME ='booomika' where Age=22";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}}



public static void main(String[] args)throws Exception {
	DeleteData();	}



public static void DeleteData()throws Exception{
String url="jdbc:mysql://127.0.0.1:3306/java_connectivity";
String username="root";
String password="2001";
String name="booomika";
String Query= "delete from jdbc where name='booomika'";
Connection con=DriverManager.getConnection(url, username, password);
PreparedStatement pst= con.prepareStatement(Query);
int rows =pst.executeUpdate();
System.out.println("rows");
con.close();
}}*/
