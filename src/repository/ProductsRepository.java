package repository;

import model.Products;

public interface ProductsRepository {	
			
			public void searchById(int number);
			public void listAll();
			public void insert(Products product);
			public void update(Products product);
			public void delete(int numero);			
			
			public void sell(Integer code, Double price);			

}