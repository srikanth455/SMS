package com.sms.dao;

import java.sql.*;

import com.sms.util.DbConnection;

public class StaffDao {

	public void selectDetails() throws Exception {
		Connection con = DbConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.executeQuery("select * from userdetails");
	}
}
