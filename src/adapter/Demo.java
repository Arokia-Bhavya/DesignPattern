package adapter;

public class Demo {
public static void main(String[] args)
{
	/*Adapter helps to connect 2 different interfaces*/
	ShopInventory inventory = new ShopInventory();
	inventory.addProduct(new CosmeticProduct("Lavie Handbag", 5000.0));
	inventory.addProduct(new FitnessProduct("Yoga SmartFit", 2000.75));


	GroceryItem groceryItem = new GroceryItem("Wheat Flour", 100.0);
	inventory.addProduct(new GroceryItemAdapter(groceryItem));
}
}
