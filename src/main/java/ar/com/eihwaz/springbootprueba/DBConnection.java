package ar.com.eihwaz.springbootprueba;
import java.sql.Connection;
import java.sql.*;  
import java.sql.DriverManager;

public class DBConnection {
	
	public void ConnectToDB() {
		/*try (Connection conn = DriverManager.getConnection(
	            "jdbc:oracle:thin:@localhost:1521:xe", "system", "m42300135")) {
	
	        if (conn != null) {
	            System.out.println("Connected to the database!");
	        } else {
	            System.out.println("Failed to make connection!");
	        }
	
	    } catch (SQLException ex) {
	        System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }*/
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}catch(Exception e){ 
			System.out.println(e);
		}  
	}
}