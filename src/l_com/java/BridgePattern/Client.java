package l_com.java.BridgePattern;

public class Client {
	public static void main(String[] args) {
		PizzaTemplate piza = new VegPizza();
		piza.preparePizza();
		
		PizzaTemplate nonpiza = new NonVegPizza();
		nonpiza.preparePizza();
	}
}
