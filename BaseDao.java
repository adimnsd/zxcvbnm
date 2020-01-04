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
	 * ʹ�����ݳ��������ݿ�
	 * @return ���Ӷ���
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
	 * �ر����ݿ�����
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
	 * ��ɾ�ķ���
	 * @param sql sql���
	 * @param z ֵ
	 * @return 0 �� 1
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
