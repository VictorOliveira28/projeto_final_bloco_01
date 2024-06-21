package repository;

import java.util.Optional;

import model.Products;

public interface ProductsRepository {				
			
			public void searchById(int number);
			public void listAll();
			public void insert(Products product);
			public Optional<Products> update(Products product);
			public void delete(int numero);					

}