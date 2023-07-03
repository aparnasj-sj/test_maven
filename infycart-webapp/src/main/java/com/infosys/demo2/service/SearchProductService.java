package com.infosys.demo2.service;


import java.util.List;
import com.infosys.demo2.dao.SearchProductDAO;
public class SearchProductService {
	public List<String> getAllProducts(){
		return new SearchProductDAO().getAllProducts();
	}
	 public String getProductsById(int prodId){
		 return new SearchProductDAO().getProductsById(prodId);
	 }
}

