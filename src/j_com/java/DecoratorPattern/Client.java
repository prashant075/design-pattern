package j_com.java.DecoratorPattern;

public class Client {
	public static void main(String[] args) {
		Bike basicBike = new BasicBike();
		
		basicBike.assembleBike();
		
		System.out.println("--------------------------");
		Bike lux = new LuxuryBike(new BasicBike());
		lux.assembleBike();
		
		System.out.println("--------------------------");
		Bike Sportlux = new SportBike(new LuxuryBike(new BasicBike()));
		Sportlux.assembleBike();
		
		System.out.println("--------------------------");
		
	}
}
