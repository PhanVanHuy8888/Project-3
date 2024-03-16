package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMSSQLConnection() throws SQLException, ClassNotFoundException {
		String driverName = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/project3";
        String user = "root";
        String pass = "123456";
        Class.forName(driverName);
        Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
        return myConn;
	}
}
