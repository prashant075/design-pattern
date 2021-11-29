package q_com.java.VisitorPattern;

public class Fruit implements Item {

	
	private String name;
	private int weight;
	private double pricePerKg;
	
	
	public Fruit(String name, int weight, double pricePerKg) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}


	public String getName() {
		return name;
	}


	public int getWeight() {
		return weight;
	}


	public double getPricePerKg() {
		return pricePerKg;
	}


	@Override
	public double accept(ShoppingCardVisitor visitor) {
		
		return 0;
	}

}
