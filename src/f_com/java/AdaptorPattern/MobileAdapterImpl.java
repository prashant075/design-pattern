package f_com.java.AdaptorPattern;

public class MobileAdapterImpl implements MobileAdapter {
	
	private WallSocket wallSocket;
	
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}


	@Override
	public Volt get3Volt() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts()/70;
		return new Volt(v3);
	}

}
