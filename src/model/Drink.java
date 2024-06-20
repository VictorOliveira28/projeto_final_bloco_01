package model;

public class Drink extends Products {

	private boolean type;

	public Drink() {
		super();
	}

	public Drink(Integer id, Integer quantity, String name, Double price, boolean type) {
		super(id, quantity, name, price);

		this.type = type;
	}

	public boolean getType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
				
		String status = type ? "Alcoolico" : "Nao Alcoolico";
		return super.toString() + String.format("Tipo: %s\n", status); 
				
	}

}
