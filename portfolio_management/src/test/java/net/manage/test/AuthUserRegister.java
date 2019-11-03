package net.manage.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
						"file:src/main/webapp/WEB-INF/spring/security-context.xml"})

public class AuthUserRegister {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private DataSource datasource;
	
//	@Test
//	public void testRegister() {
//		
//		String sql = "insert into t_member (userId, userPass, UserName, UserPhone, UserBirth) values (?, ?, ?, ?, ?)";
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//			try {
//				
//				conn = datasource.getConnection();
//				pstmt = conn.prepareStatement(sql);
//				pstmt.setString(1, "sko@naver.com");
//				pstmt.setString(2, encoder.encode("1234"));
//				pstmt.setString(3, "skocha");
//				pstmt.setString(4, "010-5555-6666");
//				pstmt.setString(5, "1990-05-05");
//				pstmt.executeUpdate();
//				
//			} catch(Exception e) {
//				e.printStackTrace();
//			} finally {
//				if(pstmt != null) {	try {	pstmt.close();	} catch(Exception e) {	}
//				if(conn != null) {	try {	conn.close();	} catch(Exception e) {	}
//				}
//			}
//		}
//	
//	}
	
	@Test
	public void testAuthRegister() {
		
		String sql = "insert into t_member_auth (userId, auth) values (?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
			try {
				
				conn = datasource.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "sko@naver.com");
				pstmt.setString(2, "ROLE_ADMIN");
				pstmt.executeUpdate();
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(pstmt != null) {	try {	pstmt.close();	} catch(Exception e) {	}
				if(conn != null) {	try {	conn.close();	} catch(Exception e) {	}
				}
			}
		}
	
	}
}