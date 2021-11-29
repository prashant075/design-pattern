package a_com.java.singletonPattern;

public class B_SingletonLazy {
	
private static  B_SingletonLazy INSTANCE = null;

	private B_SingletonLazy() {
		
	}
	
	public static B_SingletonLazy getInstnace() {
		if(INSTANCE ==null) {
			INSTANCE = new B_SingletonLazy();
		}
		return INSTANCE;
	}
}
