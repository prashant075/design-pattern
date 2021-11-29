package f_com.java.AdaptorPattern;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
