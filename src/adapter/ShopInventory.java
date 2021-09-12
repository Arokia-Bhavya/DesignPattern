package adapter;

import java.util.ArrayList;
import java.util.List;

public class ShopInventory {
	private List<Product> products;

    public ShopInventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
