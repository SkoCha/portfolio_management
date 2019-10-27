package net.manage.test;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DBTest {

	@Autowired
	private DataSource dataSource;
	
//	@Test
//	public void dbTest() throws ClassNotFoundException {
//		
//		Class.forName("org.mariadb.jdbc.Driver"); // 마리아 DB
//		try {
//			
//			String url = "jdbc:mariadb://127.0.0.1:3307/portfolio_management";
//			Connection conn = DriverManager.getConnection(url, "root", "3243");
//			log.info(conn);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Test
	public void dataSourceTest() {
		try {
			Connection conn = dataSource.getConnection();
			log.info(conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
