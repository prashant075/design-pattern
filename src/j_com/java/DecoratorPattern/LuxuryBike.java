package j_com.java.DecoratorPattern;

public class LuxuryBike extends DecoratorBike {

	public LuxuryBike(Bike bike) {
		super(bike);
	}
	
	@Override
	public void assembleBike() {
		super.assembleBike();
		
		System.out.println("Adding Luxury Bike..");
	}

}
