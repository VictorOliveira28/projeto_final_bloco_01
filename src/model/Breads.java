package model;

public class Breads extends Products {

	public Breads() {
		super();
	}

	public Breads(Integer id, Integer quantity, String name, Double price, Integer type) {
		super(id, quantity, name, price, type);
		
	}

	@Override
	public void visualize() {	
		
		System.out.println("\n\n*****************************************************");
        System.out.println("Dados do produto:");
        System.out.println("*********************************************************");
        System.out.println("Tipo: Pão");
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getName());
        System.out.println("Quantidade: " + this.getQuantity());
        System.out.println("Preço: " + this.getPrice());
        System.out.println("Classe: " + this.getType());
				
	}

}