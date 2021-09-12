package adapter;

public class GroceryItemAdapter implements Product{
	private GroceryItem groceryItem;
	
	GroceryItemAdapter(GroceryItem groceryItem) {
		super();
		this.groceryItem = groceryItem;
	}

	@Override
	public String getName() {
		return groceryItem.getItemName();
	}

	@Override
	public Double getPrice() {
		return groceryItem.getCostPerUnit(); 
	}

}
