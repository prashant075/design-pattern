package a_com.java.singletonPattern;

public class G_SingletonCloning implements Cloneable {
	
private static  G_SingletonCloning INSTANCE = null;

	private G_SingletonCloning() {
		
	}
	
	public static G_SingletonCloning getInstnace() {
		if(INSTANCE ==null) {
			INSTANCE = new G_SingletonCloning();
		}
		return INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("YOu can't create clone of singlton");
		//return super.clone();  //avoid cloning to avoid breaking of singlton
	}
}
