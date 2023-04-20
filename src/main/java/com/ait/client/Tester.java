package com.ait.client;

import com.ait.dao.ProductDAO;
import com.ait.dao.impl.ProductDAOImpl;
import com.ait.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		
		ProductDAO  dao = new ProductDAOImpl();
		/*
		 * create a new product entity
		 */
		
		
		/*
		ProductEntity pEntity = new ProductEntity();
		pEntity.setProductId(129022);
		pEntity.setProductName("Mobile");
		pEntity.setQuantity(10);
		pEntity.setUnitPrice(18500.0);
		
		*/
		
		
		/*
		 * call saveProduct() of DAO class
		 */
		
		
// 		dao.saveProduct(pEntity);
		
		
		
		/*
		 * call updateProductById() of DAO class
		 */
		
		
		/*
		ProductEntity p = dao.updateProductById(129022, 28500.0);
		System.out.println(p);

        */     
		
		
		// Load ProductByID
		
		/*
		ProductEntity pe = dao.loadProductById(129022);
		System.out.println(" PID =>"+pe.getProductId() +" Pname =>"+ pe.getProductName());
		
		*/
		
		
		// Delete ProductByID
		
		// dao.deleteProductById(129022);
		
		
		// Test entitystates
		
		// dao.testEntityStates();
		
}

}
