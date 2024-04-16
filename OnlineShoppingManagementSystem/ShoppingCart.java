package OnlineShoppingManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {

	public Map<String, Product> productListMap = new HashMap<String, Product>();

	public Map<String, Integer> cardDetailsMap = new HashMap<String, Integer>();

	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	public ShoppingCart(Product product, int wantedQuantity) {
		// TODO Auto-generated constructor stub
		productListMap.put(product.id, product);
		cardDetailsMap.put(product.id, wantedQuantity);
	}

	public void addtoCart(Product product, int wantedQuantity) {
		// TODO Auto-generated method stub
		productListMap.put(product.id, product);
		cardDetailsMap.put(product.id, wantedQuantity);

	}
	
	public void getTotalAmount() {
		double total=0;
      Set<Map.Entry<String, Integer>> entrySet = cardDetailsMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
        	String productId=entry.getKey();
        	int count=entry.getValue();
        	Product product=productListMap.get(productId);
        	double price=product.getPrice();
        	total=total+count*price;
        	
        }
        System.out.println(total);
	}

	/*
	 * @Override
	 * 
	 * 
	 * /*public void getTotalAmount() { // TODO Auto-generated method stub
	 * 
	 * //if (cardDetailsMap.containsKey(user.id)) { //List<ShoppingCart> cartdetails
	 * = cardDetailsMap.get(user.id); /*double totalCost = 0; // for (ShoppingCart
	 * cartDetail : cartdetails) { double price =
	 * cartDetail.getProduct().getPrice(); int wantedQuantity =
	 * cartDetail.getWantedQuantity(); totalCost = totalCost + (price *
	 * wantedQuantity);
	 * } System.out.println(totalCost);
	 * 
	 * }
	 */

	/*
	 * public void checkOutProduct(Product product) { // TODO Auto-generated method
	 * stub if (cardDetailsMap.containsKey(product.id)) { int removeQuantity =
	 * cardDetailsMap.get(product.id); cardDetailsMap.remove(product.id);
	 * 
	 * product.checkOut(removeQuantity); }
	 * 
	 * }
	 */

	public void addProduct(Product product) {
		// TODO Auto-generated method stub

		productListMap.put(product.id, product);
		System.out.println(productListMap);
	}

	public boolean quantityCheck(String id, int wantedQuantity) {
		// TODO Auto-generated method stub

		if (productListMap.containsKey(id)) {
			Product product = productListMap.get(id);
			int totalquantity = product.getQuantity();
			if (totalquantity >= wantedQuantity) {
				return true;
			}
		}
		return false;
	}

	public void removeProduct(Product product, int removeQuantity) {

		if (cardDetailsMap.containsKey(product.id)) {
			int quantity = cardDetailsMap.get(product.id);
			if (quantity >= removeQuantity) {
				quantity = quantity - removeQuantity;
				cardDetailsMap.put(product.id, quantity);

			} else {
				System.out.println("The product is not in the list");
			}
			System.out.println("remove" + cardDetailsMap);

		}
	}

	public void checkOutProduct(Product product) {
		if(cardDetailsMap.containsKey(product.id)) {
			cardDetailsMap.remove(product);
		}
		
	}

	/*
	 * public void productDetails() { // TODO Auto-generated method stub
	 * 
	 * for (Map.Entry<String, Product> entry : productListMap.entrySet())
	 * 
	 * System.out.println(entry.getValue());
	 * 
	 * }
	 */

	/*
	 * public void checkOutProduct(String productId, int quantity) { // TODO
	 * Auto-generated method stub ShoppingCart cart=new ShoppingCart(productId,
	 * quantity); if(cardDetailsMap.containsKey(productId)) { int
	 * removeQuantity=cardDetailsMap.get(productId);
	 * cardDetailsMap.remove(productId);
	 * 
	 * product.checkOut(removeQuantity); }
	 * 
	 * }
	 */}
