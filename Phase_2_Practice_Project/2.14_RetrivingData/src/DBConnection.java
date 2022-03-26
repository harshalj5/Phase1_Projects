import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn() throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.jdbc.Driver");
	   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eproducts","root"," ");
	   	 return con;
	    }
}