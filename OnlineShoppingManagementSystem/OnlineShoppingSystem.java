package OnlineShoppingManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineShoppingSystem {

//	List<ShoppingCart> cartList = new ArrayList<ShoppingCart>();

	static OnlineShoppingSystem shoppingSystem = new OnlineShoppingSystem();
	public List<User> userList = new ArrayList<User>();
	Product productt = new Product();
	User user = new User();
	ShoppingCart shoppingCart=new ShoppingCart();
//   public Map<String, Integer> cardDetailsMap = new HashMap<String, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product("P001", "Laptop", "High-performance laptop", 999.99, 10);
		Product product2 = new Product("P002", "Smartphone", "Latest smartphone model", 599.99, 20);
		Product product3 = new Product("P003", "Headphones", "Noise-canceling headphones", 149.99, 15);
		shoppingSystem.addProduct(product1);
		shoppingSystem.addProduct(product2);
		shoppingSystem.addProduct(product3);
		User user1 = new User("U001", "John Doe");
		User user2 = new User("U002", "Jane Smith");
		shoppingSystem.addUser(user1);
		shoppingSystem.addUser(user2);

		shoppingSystem.addToCart(user1, product2, 1);
		shoppingSystem.addToCart(user2, product3, 5);
		shoppingSystem.addToCart(user1, product1, 4);
		shoppingSystem.removeProductFromCart(user1, product1, 4);
		shoppingSystem.removeProductFromCart(user2, product3, 2);
		// shoppingSystem.removeProductFromCart(user1, "P002", 1);
		// shoppingSystem.viewCart(user1);
		// shoppingSystem.viewCart(user2);
	//	shoppingSystem.allProductDetails();
		shoppingSystem.getTotalCost(user1);
	    shoppingSystem.checkOutProduct(product1, user1);
	//	shoppingSystem.viewCart(user2);

	}

	
	private void addProduct(Product product) {
		// TODO Auto-generated method stub
//	
		shoppingCart.addProduct(product);

	}

/*	private void viewCart(User user) {
		// TODO Auto-generated method stub
		user.viewCart();

	}*/

	private void checkOutProduct(Product product, User user) {
		user.checkOutProduct(product);

	}

	private void getTotalCost(User user) {
		// TODO Auto-generated method stub
		user.getTotalCost();

	}

/*	private void allProductDetails() {
		// TODO Auto-generated method stub
		productt.productDetails();
	}*/

	private void addUser(User user) {
		userList.add(user);
		
	}

	private void addToCart(User user, Product product, int wantedQuantity) {
		// TODO Auto-generated method stub

		user.addToCart(product, wantedQuantity);

	}

	private void removeProductFromCart(User user, Product product, int removeQuantity) {

		user.removeProduct(product, removeQuantity);

	}

}
