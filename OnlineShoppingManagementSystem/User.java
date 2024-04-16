package OnlineShoppingManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	String id;
	String name;
	ShoppingCart shoppingCart;
	
	//Map<String, List<ShoppingCart>> cardDetailsMap = new HashMap<String, List<ShoppingCart>>();

	public User(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.shoppingCart=new ShoppingCart();
	}

	public User() {
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

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", shoppingCart=" + shoppingCart + "]";
	}

	Product product = new Product();
	//ShoppingCart shoppingCartt = new ShoppingCart();

	public void addToCart(Product product, int wantedQuantity) {
		
		 shoppingCart.addtoCart(product, wantedQuantity);

		/*if (cardDetailsMap.containsKey(this.id)) {
			cardDetailsMap.get(this.id).add(cart);

		} else {
			List<ShoppingCart> cartList = new ArrayList<ShoppingCart>();
			cartList.add(cart);
			cardDetailsMap.put(this.id, cartList);
		}
		System.out.println(cardDetailsMap);*/
		  }

	
	 /* catch(Exception e) { System.out.println("quantity is high"); }
	 
		  }*/
	public void removeProduct(Product product, int removeQuantity) {
		// TODO Auto-generated method stub
      shoppingCart.removeProduct(product,removeQuantity);
		
	}

	public void getTotalCost() {
		shoppingCart.getTotalAmount();

	}

	public void checkOutProduct(Product product) {
		shoppingCart.checkOutProduct(product);
	}

/*	public void viewCart() {
		// TODO Auto-generated method stub
		if (cardDetailsMap.containsKey(this.id)) {

			List<ShoppingCart> productDetailsInCart = cardDetailsMap.get(this.id);
			for (ShoppingCart cart : productDetailsInCart) {
				System.out.println(cart);
			}
		}

	}*/

	

}
