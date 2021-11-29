package o_com.java.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Shoppingcart {
	private List<Product> productList;

	public Shoppingcart() {
		productList = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	private int calculateTotalPrice() {
		return productList.stream().map(p->p.getPrice()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
		
	}
}
