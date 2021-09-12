package adapter;

public class CosmeticProduct implements Product {
	String name;
	Double price;
	public CosmeticProduct(String name, double price) {
		this.name=name;
		this.price=price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Double getPrice() {
		return this.price;
	}

}
