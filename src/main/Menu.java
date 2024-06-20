package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.Breads;
import model.Drink;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer option, code;
		Double price;
		String name;
		
		Breads bd = new Breads(1, 100, "Pao Suiço", 1.50);
		Breads bd1 = new Breads(1, 100, "Pao Frances", 1.80);
		Drink dr = new Drink(2, 5, "Café", 2.50, false);
		Drink dr1 = new Drink(2, 7, "Whisky", 28.80, true);
		

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
			System.out.println("       6.Vender                         ");
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
				System.out.println("Insira o nome do produto: ");
				name = sc.nextLine();

				break;

			case 2:
				System.out.println("#####################################");
				System.out.println("##### Listar todos os produtos #####");
				System.out.println("#####################################");
				System.out.println("\n\n");
				
				System.out.println(bd);
				System.out.println(bd1);
				System.out.println(dr);
				System.out.println(dr1);
				break;

			case 3:
				System.out.println("#####################################");
				System.out.println("##### Buscar produto por código #####");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				break;

			case 4:
				System.out.println("#####################################");
				System.out.println("######### Atualizar produto #########");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				break;

			case 5:
				System.out.println("#####################################");
				System.out.println("########## Deletar produto ##########");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				break;

			case 6:
				System.out.println("#####################################");
				System.out.println("########## Vender produto ##########");
				System.out.println("#####################################");
				System.out.println("\nInsira o código do produto: ");
				code = sc.nextInt();

				break;

			default:
				System.out.println("\n\nOpção Inválida!\n\n");

				break;

			}
		}

	}

}
