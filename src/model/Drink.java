package model;

public class Drink extends Products {

	private boolean alcoholic;

	public Drink() {
		super();
	}

	public Drink(Integer id, Integer quantity, String name, Double price, Integer type, boolean alcoholic) {
		super(id, quantity, name, price, type);
		
		this.alcoholic = alcoholic;
	}
	
	public boolean isAlcoholic() {
		return alcoholic;
	}

	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	@Override
	public void visualize() {

		String status = alcoholic ? "Alcoolico" : "Nao Alcoolico";

		System.out.println("\n\n*****************************************************");
		System.out.println("Dados do produto:");
		System.out.println("*********************************************************");
		System.out.println("Tipo: Bebida");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getName());
		System.out.println("Quantidade: " + this.getQuantity());
		System.out.printf("Preço: %.2f\n", this.getPrice());
		System.out.println("Status Alcoólico: " + status);
		System.out.println("Classe: " + this.getType());

	}

}
