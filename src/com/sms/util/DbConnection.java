package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private DbConnection() {
	}

	static Connection dbcon;

	static public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (null == dbcon)
				dbcon = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/test", "", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return dbcon;
	}
}
