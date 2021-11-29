package q_com.java.VisitorPattern;

public interface ShoppingCardVisitor {
	public double visit(BookI book);
	public double visit(Fruit fruit);
}
