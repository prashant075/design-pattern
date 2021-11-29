package a_com.java.singletonPattern;


//fully thread safe
public class D_SingletonBillBurg {
	
	private D_SingletonBillBurg() {
		
	}

	private static class SingletonHolder{
		private static  D_SingletonBillBurg INSTANCE = new D_SingletonBillBurg();
	}
	
	public static  D_SingletonBillBurg getInstnace() {
		return SingletonHolder.INSTANCE;
	}
}
