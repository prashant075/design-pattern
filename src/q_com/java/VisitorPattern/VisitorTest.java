package q_com.java.VisitorPattern;

public class VisitorTest {
	public static void main(String[] args) {
		Item items[] = new Item[] {
				new BookI("Core Java","45454",450.0),
				new BookI("Adv Java","453454454",400.0),
				new Fruit("Mango",2,100),
				new Fruit("Apple",3,100)
		};
		
		double totalCost = calculateTotalCost(items);
		System.out.println("Total Cost ::"+totalCost);
	}

	private static double calculateTotalCost(Item[] items) {
		ShoppingCardVisitor shv = new ShoppingCardVisitorImpl();
		double totalCost =0.0;
		
		for(Item i:items) {
			totalCost += i.accept(shv);
		}
		return totalCost;
	}
}	
