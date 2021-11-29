package j_com.java.DecoratorPattern;

public class SportBike extends DecoratorBike {

	public SportBike(Bike bike) {
		super(bike);
	}

	   @Override
		public void assembleBike() {
			super.assembleBike();
			System.out.println("Adding features of Sports Bike...");
		}

}
