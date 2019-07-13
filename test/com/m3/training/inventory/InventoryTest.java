package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;







class InventoryTest {
	
	private Inventory objectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		objectUnderTest = new Inventory();
	}
	
	@Test
	void test_CalculatorTest_constructor() {
		assertNotNull(objectUnderTest);
	}	
	
	@Test
	void test_InventoryTest_loadItems() {
		String input = "Let var = 5.0";
		Double expected = 5.0;
		Double actual = objectUnderTest.loadItems();
		String msg = "file not available";
		assertEquals(expected, actual, msg);
	}
	
	@Test
	void test() {
		
	}

}
