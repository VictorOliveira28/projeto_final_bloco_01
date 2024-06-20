package repository;

import model.Products;

public interface ProductRepository {
	
			// CRUD de produto
			public void searchById(int numero);
			public void listAll();
			public void insert(Products product);
			public void update(Products product);
			public void delete(int numero);
			
			// Métodos venda
			public void sell(Integer code, Double price);
			

}
