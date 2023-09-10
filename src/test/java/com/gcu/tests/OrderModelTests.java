package com.gcu.tests;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import com.gcu.model.OrderModel;

class OrderModelTests {
	
	OrderModel orderModel = new OrderModel();

	@Test
	void idTest() {
		
		//Values should be equal
		long testId = 1;
		orderModel.setId(testId);
		assertEquals(testId, orderModel.getId());	
		
		//Values should not be equal
		orderModel.setId(2);
		assertNotEquals(testId, orderModel.getId());	
	}
	
	@Test
	void orderNoTest() {
		
		String testOrderNo = "1fda2314saf31";
		orderModel.setOrderNo(testOrderNo);
		assertEquals(testOrderNo, orderModel.getOrderNo());
		
		orderModel.setOrderNo("5463gfsgsd33");
		assertNotEquals(testOrderNo, orderModel.getOrderNo());
	}
	
	@Test
	void productNameTest() {
		
		String testProductName = "iPhone X";
		orderModel.setProductName(testProductName);
		assertEquals(testProductName, orderModel.getProductName());
		
		orderModel.setProductName("iPhone XR");
		assertNotEquals(testProductName, orderModel.getProductName());
	}
	
	@Test
	void priceTest() {
		
		//Values should be equal
		float testPrice = 2.0f;
		orderModel.setPrice(testPrice);
		assertEquals(testPrice, orderModel.getPrice(), 0);
		
		//Values should not be equal
		orderModel.setPrice(3.0f);
		assertNotEquals(testPrice, orderModel.getPrice());	
	}
	
	@Test
	void quantityTest() {
		
		//Values should be equal
		int testQuantity = 2;
		orderModel.setQuantity(testQuantity);
		assertEquals(testQuantity, orderModel.getQuantity());
		
		//Values should not be equal
		orderModel.setQuantity(3);
		assertNotEquals(testQuantity, orderModel.getQuantity());	
	}
	

}
