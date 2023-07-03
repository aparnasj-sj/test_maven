package com.infosys.demos.service;
import java.util.List;
import com.infosys.demos.dao.SearchProductDAO;
public class SearchProductService {
	public List<String> getAllProducts(){
		return new SearchProductDAO().getAllProducts();
	}
	 public String getProductsById(int prodId){
		 return new SearchProductDAO().getProductsById(prodId);
	 }
}
