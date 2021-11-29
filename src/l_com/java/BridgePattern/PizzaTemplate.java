package l_com.java.BridgePattern;

public abstract class PizzaTemplate {
	
	public final void preparePizza() {
		selectBread();
		addingIngredients();
		cooking();
		addingCheese();
		addingTopings();
		
	}
	
	public abstract void selectBread();
	public abstract void addingIngredients();
	
	private void cooking() {
		System.out.println("Cooking Pizza");
		
	}
	
	private void addingCheese() {
		System.out.println("Adding Cheese");
		
	}

	private void addingTopings() {
		System.out.println("Adding Topings");
		
	}

	

	
}

