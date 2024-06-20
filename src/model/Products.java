package model;

public abstract class Products {
	
	private Integer id;
	private Integer quantity;
	private String name;
	private Double price;
	private Integer type;
	
	public Products() {		
	}

	public Products(Integer id, Integer quantity, String name, Double price, Integer type) {
		
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.type = type;
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
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void visualize() {		 
				
		System.out.println("\n\n*****************************************************");
		System.out.println("Dados do produto:");
		System.out.println("*********************************************************");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.name);
		System.out.println("Quantidade: " + this.quantity);
		System.out.printf("Preço: %.2f", this.price);		
				
	}
		
}
