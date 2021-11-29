package f_com.java.AdaptorPattern;

public class Client {
	public static void main(String[] args) {
	
		WallSocket ws = new WallSocketImpl();
		Volt v240 = ws.getVolts();
		System.out.println(v240);
		
		MobileAdapter ma = new MobileAdapterImpl(ws);
		
		Volt v3 = ma.get3Volt();
		System.out.println(v3);
	
	}
}
