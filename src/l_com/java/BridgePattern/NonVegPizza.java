package l_com.java.BridgePattern;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for NonVeg PIzza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding Ingredients In NonVeg-Pizza");
	}

}
