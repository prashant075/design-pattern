package q_com.java.VisitorPattern;

public class BookI implements Item {

	private String name;
	private String isbnNumber;
	private double price;
	
	
	public BookI(String name, String isbnNumber, double price) {
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}


	public String getIsbnNumber() {
		return isbnNumber;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public double accept(ShoppingCardVisitor visitor) {
		return visitor.visit(this);
	}

}
