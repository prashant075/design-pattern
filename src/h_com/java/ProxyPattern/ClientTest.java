package h_com.java.ProxyPattern;

public class ClientTest {
	public static void main(String[] args) {
		
		VeryExpensiveProcess vep = new VeryExpensiveProcessProxy();
		vep.process();
		vep.process();
	}
}
