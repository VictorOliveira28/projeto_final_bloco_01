package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

import controller.ProductsController;
import model.Breads;
import model.Drink;
import model.Products;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ProductsController products = new ProductsController();

		Integer option, code, quantity;
		Double price;
		String name;
		Integer type;
		boolean alcoholic;

		Breads bd = new Breads(products.generateCode(), 100, "Pao Suiço", 1.50, 1);
		products.insert(bd);

		Breads bd1 = new Breads(products.generateCode(), 100, "Pao Frances", 1.80, 1);
		products.insert(bd1);

		Drink dr = new Drink(products.generateCode(), 5, "Café", 2.50, 2, false);
		products.insert(dr);

		Drink dr1 = new Drink(products.generateCode(), 7, "Whisky", 28.80, 2, true);
		products.insert(dr1);

		while (true) {
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("           Padaria do seu Zé            ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("       1.Adicionar produto              ");
			System.out.println("       2.Listar todos os produtos       ");
			System.out.println("       3.Buscar produto por código      ");
			System.out.println("       4.Atualizar produto              ");
			System.out.println("       5.Apagar produto                 ");
			System.out.println("       0.Sair                           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("Entre na opção desejada:                ");

			try {
				option = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros");
				sc.nextLine();
				option = 0;
			}

			if (option == 0) {
				System.out.println("Terminal de trabalho encerrado.");
				sc.close();
				System.exit(0);
			}

			switch (option) {
			case 1:
				System.out.println("#############################");
				System.out.println("##### Adicionar Produto #####");
				System.out.println("#############################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();
				sc.nextLine();

				do {
					System.out.println("Digite o tipo do produto(1-Paes ou 2-Bebidas): ");
					type = sc.nextInt();
				} while (type < 1 || type > 2);

				System.out.println("Insira a quantidade do produto: ");
				quantity = sc.nextInt();
				sc.nextLine();
				System.out.println("Insira o nome do produto: ");
				name = sc.nextLine();
				System.out.println("Insira o preço do produto: ");
				price = sc.nextDouble();

				if (type == 1) {

					products.insert(new Breads(products.generateCode(), quantity, name, price, type));

				} else if (code == 2) {
					System.out.println("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					sc.nextLine();
					System.out.println("Insira o nome do produto: ");
					name = sc.nextLine();
					System.out.println("Insira o preço do produto: ");
					price = sc.nextDouble();
					System.out.println("Insira o tipo da bebida (TRUE) Alcoolica (FALSE) Nao Alcoolica");
					alcoholic = sc.nextBoolean();

					products.insert(new Drink(code, quantity, name, price, type, alcoholic));

				}

				break;

			case 2:
				System.out.println("#####################################");
				System.out.println("##### Listar todos os produtos ######");
				System.out.println("#####################################");
				System.out.println("\n\n");

				products.listAll();

				break;

			case 3:
				System.out.println("#####################################");
				System.out.println("##### Buscar produto por código #####");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				products.searchById(code);

				break;

			case 4:
				System.out.println("#####################################");
				System.out.println("######### Atualizar produto #########");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");

				try {
					code = sc.nextInt();
					var found = products.findInList(code);

					if (found == null || found.isEmpty()) {
						System.out.println("Produto não encontrado.");
					} else {
						Products productUpdate = found.get(0);

						System.out.println("Insira a quantidade do produto: ");
						quantity = sc.nextInt();
						sc.nextLine();

						System.out.println("Insira o nome do produto: ");
						name = sc.nextLine();

						System.out.println("Insira o preço do produto: ");
						price = sc.nextDouble();
						sc.nextLine();

						if (productUpdate instanceof Breads) {
							type = 1;
							Breads updateBread = new Breads(code, quantity, name, price, type);
							Optional<Products> updatedBread = products.update(updateBread);
							if(updatedBread.isPresent()) {
								System.out.println("Produto atualizado com sucesso!");
							} else {
								System.out.println("Falha ao atualizar o produto!");
							}
						} else if (productUpdate instanceof Drink) {
							type = 2;
							System.out.println("A bebida é alcoólica? (true para Alcoólica, false para Não Alcoólica): ");
							alcoholic = sc.nextBoolean();
							Drink updateDrink = new Drink(code, quantity, name, price, type, alcoholic);
							Optional<Products> updatedDrink = products.update(updateDrink);
							if(updatedDrink.isPresent()) {
								System.out.println("Produto atualizado com Sucesso!");
							} else {
								System.out.println("Falha ao atualizar o produto!");
							}
							//products.update(updateDrink);
						}
					}					

				} catch (InputMismatchException e) {
					sc.nextLine();
					System.out.println("Digite valores inteiros!");
				}
				
				break;

			case 5:
				System.out.println("#####################################");
				System.out.println("########## Deletar produto ##########");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				products.delete(code);

				break;

			default:
				System.out.println("\n\nOpção Inválida!\n\n");

				break;

			}
		}

	}

}
