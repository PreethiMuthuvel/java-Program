package OnlineShoppingManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Product {
	String id;
	String name;
	String description;
	double price;
	int quantity;
	
	public Product(String id, String name, String description, double price, int quantity) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;

	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	/*public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productListMap.put(product.id, product);
	}*/


/*	public void checkOut(int removeQuantity) {
		// TODO Auto-generated method stub
		if (quantity > removeQuantity) {
			quantity = quantity - removeQuantity;
			System.out.println(quantity);
		}

	}*/

	

}
