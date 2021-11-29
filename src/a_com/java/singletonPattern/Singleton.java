package a_com.java.singletonPattern;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstnace() {
		return INSTANCE;
	}
}
