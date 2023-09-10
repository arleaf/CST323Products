// OUT OF DATE

// package com.gcu.tests;
// import com.gcu.model.*;

// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertEquals; 
// import static org.junit.jupiter.api.Assertions.assertNotEquals;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// class LoginModelTests {
	
// 	LoginModel loginModel = new LoginModel();
	
// 	@Test
// 	void emailTest() {
// 		//Values should be equal
// 		String testEmail = "test@gmail.com";
// 		loginModel.setEmail(testEmail);
// 		String returnEmail = loginModel.getEmail();
// 		assertEquals(testEmail, returnEmail);	
		
		
// 	}
	
// 	@Test
// 	void passwordTest() {
		
// 		//Values should be equal
// 		String testPassword = "1234567890";
// 		loginModel.setPassword(testPassword);
// 		String returnPassword = loginModel.getPassword();
// 		assertEquals(testPassword, returnPassword);	
		
// 		//Values should not be equal
// 		loginModel.setPassword("NotFound");
// 		String newReturnPassword = loginModel.getPassword();
// 		assertNotEquals(testPassword, newReturnPassword);
// 	}
	
// 	@Test
// 	void authenticationTest() throws SQLException {
		
// 		//Inserting values into database
// 		String jdbcUrl = "jdbc:mysql://localhost:3306/cst339";
		
// 		loginModel.setEmail("Test@gmail.com");
// 		loginModel.setPassword("1234567890");
		
// 		try(Connection connection = DriverManager.getConnection(jdbcUrl,"root","root")) {
// 	    	String query = "INSERT INTO users (F_NAME, L_NAME, EMAIL, PASSWORD, ADDRESS, PHONE)"
// 	    			+ "VALUES (?, ?, ?, ?, ?, ?);";
	    	
// 	    	PreparedStatement preparedStmt = connection.prepareStatement(query);
// 	    	preparedStmt.setString(1, "Test");
// 	    	preparedStmt.setString(2, "Subject");
// 	    	preparedStmt.setString(3, "Test@gmail.com");
// 	    	preparedStmt.setString(4, "1234567890");
// 	    	preparedStmt.setString(5, "12345 SE ELm St");
// 	    	preparedStmt.setString(6, "5046667777");
// 	    	preparedStmt.execute();
// 		} 
// 		catch (SQLException e) {
		
// 			e.printStackTrace();
// 		}
// 		//Validating the values are found within the database
// 		assertTrue(loginModel.authenticate());
		
// 		//Value should not be authenticated because it won't be found within the database
// 		loginModel.setEmail("NotFound@gmail.com");
// 		loginModel.setPassword("0987654321");
		
// 		assertFalse(loginModel.authenticate());
// 	}

// }
