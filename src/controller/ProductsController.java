package controller;

import java.util.ArrayList;
import java.util.List;

import model.Products;
import repository.ProductsRepository;

public class ProductsController implements ProductsRepository{
	
	private List<Products> list = new ArrayList<>();

	@Override
	public void searchById(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Products product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Products product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell(Integer code, Double price) {
		// TODO Auto-generated method stub
		
	}
	
	public Products findInList(Integer code) {
		
		for(var prod : list) {
			if(prod.getId() == code) {
				return prod;
			}
		}
		
		return null;
	}
	

}
