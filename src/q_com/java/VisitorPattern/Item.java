package q_com.java.VisitorPattern;

public interface Item {
	public double accept(ShoppingCardVisitor visitor);
}
