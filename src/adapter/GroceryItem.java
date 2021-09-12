package adapter;

public class GroceryItem {
	String itemName;
	Double costPerUnit;
    public GroceryItem(String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public String getItemName() {
		return itemName;
	}
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
    public Double getCostPerUnit() {
		return costPerUnit;
	}
    public void setCostPerUnit(Double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
}
