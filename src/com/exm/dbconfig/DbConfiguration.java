package com.exm.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DbConfiguration {
	private static final String JBDC_URL = "jdbc:postgresql://localhost:5432/dbservicio";
	private static final String JDBC_USER = "postgres";
	private static final String JDBC_PASSWORD = "postgres";

	public java.sql.Connection getConnection() throws Exception, SQLException {
		return DriverManager.getConnection(JBDC_URL, JDBC_USER, JDBC_PASSWORD);
	}

	public void close(ResultSet rs) throws Exception, SQLException {
		rs.close();
	}

	public void close(PreparedStatement ps) throws Exception, SQLException {
		ps.close();
	}

	public void close(Connection conn) throws Exception, SQLException {
		conn.close();
	}

	public void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws Exception, SQLException {
		if (rs != null) {
			rs.close();
		}

		if (ps != null) {
			ps.close();
		}

		if (conn != null) {
			conn.close();
		}
	}

	public void closeConnection(Connection conn, PreparedStatement ps) throws Exception, SQLException {
		if (ps != null) {
			ps.close();
		}

		if (conn != null) {
			conn.close();
		}
	}
}
