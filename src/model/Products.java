package model;

public abstract class Products {
	
	private Integer id;
	private Integer quantity;
	private String name;
	private Double price;
	
	public Products() {		
	}

	public Products(Integer id, Integer quantity, String name, Double price) {
		
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public boolean sell(Integer quantity) {
		
		if(this.getQuantity() < quantity) {
			System.out.println("Não temos essa quantidade em estoque.");
			return false;
		}
		
		this.setQuantity(this.getQuantity() - quantity);
		return true;
		
	}

	@Override
	public String toString() {
		return String.format("Product id: %d\nname: %s\nprice: %.2f\n", id, name, price); 
				
	}
		
}
