package org.amin.springpractice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.amin.springpractice.model.Circle;

public class JdbcDaoImpl {
	public Circle getCircle(int circleId) {
		
		Connection conn = null;
		
		try {
			
//			Set environment variable DERBY_HOME = C:\Users\Dohatec\OneDrive\Documents\spring lib\spring data support\db-derby-10.8.2.2-bin\db-derby-10.8.2.2-bin 
//			and Path = $DERBY_HOME\bin

//			go $DERBY_HOME\bin directory and run startNetworkServer.bat in windows and will shows message as below
//			Security manager installed using the Basic server security policy.
//			Apache Derby Network Server - 10.8.2.2 - (1181258) started and ready to accept connections on port 1527
			
//			go $DERBY_HOME\bin directory and run ij.bat in windows
			
//			connect 'jdbc:derby://localhost:1527/derby_db;create=true';
//			Create circle table if not exist
//			CREATE TABLE circle (id integer, name char(50));
//			SELECT * FROM circle
//			INSERT into circle values(3, 'Third Circle');

			String driver = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/derby_db");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1, circleId);
			
			Circle circle = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();
			return circle;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
