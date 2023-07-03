package com.infosys.demos.service;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import com.infosys.demos.service.SearchProductService;
public class SearchProductServiceTest {
	SearchProductService searchProductService = new SearchProductService();
	
	@Test
	public void testGetAllProductsPositive() {
		List<String> allProducts = searchProductService.getAllProducts();
		assertFalse(allProducts.isEmpty());
	}
	
 /*	@Test
	public void testGetAllProductsNegative() {
		List<String> allProducts = searchProductService.getAllProducts();
		assertTrue(allProducts.isEmpty());
	}*/
	@Test
	public void testGetProductsByIdPositive() {
		String product = searchProductService.getProductsById(1001);
		assertEquals("Samsung Galaxy", product);
	}
	
	/*@Test
	public void testGetProductsByIdNegative() {
		String product = searchProductService.getProductsById(0);
		assertNull(product);
	}*/
}
