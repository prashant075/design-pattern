package a_com.java.singletonPattern;

public class A_SingletonStatic {
	
private static  A_SingletonStatic INSTANCE = null;

	private A_SingletonStatic() {
		
	}
	
	static {
		try {
			if(INSTANCE ==null) {
				INSTANCE = new A_SingletonStatic();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static A_SingletonStatic getInstnace() {
		return INSTANCE;
	}
}
