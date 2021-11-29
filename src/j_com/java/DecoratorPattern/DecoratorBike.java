package j_com.java.DecoratorPattern;

public class DecoratorBike implements Bike {

	private Bike bike;
	
	
	public DecoratorBike(Bike bike) {
		super();
		this.bike = bike;
	}


	@Override
	public void assembleBike() {
		bike.assembleBike();
	}

}
