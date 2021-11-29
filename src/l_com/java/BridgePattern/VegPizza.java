package l_com.java.BridgePattern;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for Veg PIzza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding Ingredients In Veg-Pizza");
	}

}
