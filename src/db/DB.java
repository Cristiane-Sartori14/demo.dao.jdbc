package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
<<<<<<< HEAD

	private static Connection conn = null;
	
=======
	private static Connection conn = null;

>>>>>>> 8b836f5 (Inicializando o projeto)
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
<<<<<<< HEAD
			}
			catch (SQLException e) {
=======
			} catch (SQLException e) {
>>>>>>> 8b836f5 (Inicializando o projeto)
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 8b836f5 (Inicializando o projeto)
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
<<<<<<< HEAD
	
=======

>>>>>>> 8b836f5 (Inicializando o projeto)
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
<<<<<<< HEAD
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeStatement(Statement st) {
		if (st != null) {
=======
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	public static void closeStatement(Statement st) {
		if(st != null) {
>>>>>>> 8b836f5 (Inicializando o projeto)
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
<<<<<<< HEAD

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
=======
	
	public static void closeResultSet(ResultSet rs) {
		if(rs != null) {
>>>>>>> 8b836f5 (Inicializando o projeto)
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
