package model;

public class Breads extends Products {

	public Breads() {
		super();
	}

	public Breads(Integer id, Integer quantity, String name, Double price) {
		super(id, quantity, name, price);
		
	}
	

	@Override
	public boolean sell(Integer quantity) {
				

		if (this.getQuantity() < quantity) {
			System.out.println("Não temos essa quantidade em estoque.");
			return false;
		}
		
		Integer unitSell = (int) Math.ceil(quantity);

		this.setQuantity(this.getQuantity() - unitSell);
		return true;

	}	
	

}
