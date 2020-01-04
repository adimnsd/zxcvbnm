package com.real.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BaseDao {
	/**
	 * 使用数据池连接数据库
	 * @return 连接对象
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			javax.sql.DataSource ds = (javax.sql.DataSource)ctx.lookup("java:comp/env/real");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	
	
	/**
	 * 关闭数据库连接
	 * @param conn
	 * @param pstemt
	 * @param rs
	 */
	public void close(Connection conn,PreparedStatement pstemt,ResultSet rs) {
		try {
			if(conn != null) {
				conn.close();
			}
			if(pstemt != null) {
				pstemt.close();
			}
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 增删改方法
	 * @param sql sql语句
	 * @param z 值
	 * @return 0 或 1
	 */
	public int update(String sql,Object[] z) {
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		int sc = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i = 0; i < z.length; i++) {
				pstmt.setObject(i+1, z[i]);
			}
			sc = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sc;
	}
}
