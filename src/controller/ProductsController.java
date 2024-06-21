package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Products;
import repository.ProductsRepository;

public class ProductsController implements ProductsRepository {

	private List<Products> list = new ArrayList<>();
	private Integer number = 0;

	@Override
	public void searchById(int number) {

		List<Products> foundProduct = findInList(number);

		if (foundProduct != null && !foundProduct.isEmpty()) {
			for (Products prod : foundProduct) {
				prod.visualize();
			}

		} else {

			System.out.printf("O produto id: %d não foi localizado!", number);
		}

	}

	@Override
	public void listAll() {

		for (Products product : list) {
			product.visualize();
		}

	}

	@Override
	public void insert(Products product) {

		list.add(product);

		System.out.println("Produto cadastrado com sucesso!");

	}

	@Override
	public Optional<Products> update(Products product) {
		
		var prod = findInList(product.getId());

		if (prod != null && !prod.isEmpty()) {

			int index = list.indexOf(prod.get(0));
			list.set(index, product);

			System.out.println("\nO produto numero: " + product.getId() + " foi atualizado com sucesso!");
			
			return Optional.of(product);
		} else {
			System.out.println("\nO produto numero: " + product.getId() + " não foi encontrado!");
			return Optional.empty();
		}		
	}

	@Override
	public void delete(int numero) {

		List<Products> product = findInList(numero);

		if (product != null && !product.isEmpty()) {
			list.remove(product.get(0));
			System.out.println("Produto deletado com sucesso!");
		} else {
			System.out.println("Produto não encontrado!");
		}

	}

	public List<Products> findInList(Integer code) {

		return list.stream().filter(product -> product.getId() == code).collect(Collectors.toList());

	}

	public Integer generateCode() {
		return ++number;
	}

}
