package com.gcu.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gcu.data.entity.AuthorityEntity;

class AuthorityEntityTests {

	AuthorityEntity authorityEntity = new AuthorityEntity();
	
	@Test
	void authorityEntityTest() {
		String testUsername = "Test";
		String testAuthority = "ROLE_USER";
		authorityEntity = new AuthorityEntity(testUsername, testAuthority);
		assertEquals(authorityEntity.getUsername(), testUsername);
		assertEquals(authorityEntity.getAuthority(), testAuthority);
		
		authorityEntity = new AuthorityEntity();
		assertEquals(authorityEntity.getUsername(), null);
		assertEquals(authorityEntity.getAuthority(), null);
	}
	
	
	@Test
	void idTest() {
		
		assertEquals(authorityEntity.getId(), 0);	
		
		//Values should be equal
		long testId = 1;
		authorityEntity.setId(testId);
		assertEquals(testId, authorityEntity.getId());	
		
		//Values should not be equal
		authorityEntity.setId(2);
		assertNotEquals(testId, authorityEntity.getId());	
	}
	
	@Test
	void usernameTest() {
		
		assertEquals(authorityEntity.getUsername(), null);	
		
		//Values should be equal
		String testUsername = "Test";
		authorityEntity.setUsername(testUsername);
		assertEquals(testUsername, authorityEntity.getUsername());	
		
		//Values should not be equal
		authorityEntity.setUsername("NOT FOUND");
		assertNotEquals(testUsername, authorityEntity.getUsername());	
	}
	
	@Test
	void authorityTest() {
		
		assertEquals(authorityEntity.getUsername(), null);	
		
		//Values should be equal
		String testAuthority = "ROLE_USER";
		authorityEntity.setAuthority(testAuthority);
		assertEquals(testAuthority, authorityEntity.getAuthority());	
		
		//Values should not be equal
		authorityEntity.setAuthority("ADMIN_USER");
		assertNotEquals(testAuthority, authorityEntity.getAuthority());	
	}
	
	

}
