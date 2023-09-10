package com.gcu.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.gcu.model.ProductModel;

class ProudctModelTests {

	ProductModel productModel = new ProductModel();
	
	@Test
	void idTest() {
		
		//Values should be equal
		long testId = 1;
		productModel.setId(testId);
		assertEquals(testId, productModel.getId());	
		
		//Values should not be equal
		productModel.setId(2);
		assertNotEquals(testId, productModel.getId());	
	}
	
	@Test
	void nameTest() {
		
		//Values should be equal
		String testName = "Test";
		productModel.setName(testName);
		String returnName = productModel.getName();
		assertEquals(testName, returnName);	
		
		//Values should not be equal
		productModel.setName("Subject");
		assertNotEquals(testName, productModel.getId());	
	}
	
	@Test
	void priceTest() {
		
		//Values should be equal
		float testPrice = 2.0f;
		productModel.setPrice(testPrice);
		assertEquals(testPrice, productModel.getPrice(), 0);
		
		//Values should not be equal
		productModel.setPrice(3.0f);
		assertNotEquals(testPrice, productModel.getPrice());	
	}
	
	@Test
	void productTest() {
		
		long id = 1;
		String name = "iPhone X";
		float price = 1.0f;
		productModel = new ProductModel(id, name, price);
		assertEquals(productModel.getId(), id);
		assertEquals(productModel.getName(), name);
		assertEquals(productModel.getPrice(), price, 0);
	}
	

}
