package festival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLUtil {

	public static Connection createConnection() {

		try {
			Connection connection = DriverManager.getConnection(SQLConstant.URL, SQLConstant.USERNAME,
					SQLConstant.PASSWORD);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Connection closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}