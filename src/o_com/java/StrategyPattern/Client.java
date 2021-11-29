package o_com.java.StrategyPattern;

public class Client {
	public static void main(String[] args) {
		Shoppingcart sc = new Shoppingcart();
		Product p1 = new Product("Soap","2323",120);
		Product p2 = new Product("Cookie","3434",100);
		Product p3 = new Product("MilkPacked","3432",150);
		
		sc.addProduct(p1);
		sc.addProduct(p2);
		sc.addProduct(p3);
		sc.payment(new CreditCardPaymentMethod("KK","244353453","232","11/22"));
		sc.payment(new PayPalPaymentMethod("KK","244353453"));
		Object a = new Object();
		
	}

	
	
	
}

