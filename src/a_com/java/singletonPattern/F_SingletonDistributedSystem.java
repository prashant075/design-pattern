package a_com.java.singletonPattern;

import java.io.Serializable;

public class F_SingletonDistributedSystem implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -2361410576743014262L;
	
	private static  F_SingletonDistributedSystem INSTANCE = null;

	private F_SingletonDistributedSystem() {
		
	}
	
	public static F_SingletonDistributedSystem getInstnace() {
		if(INSTANCE ==null) {
			INSTANCE = new F_SingletonDistributedSystem();
		}
		return INSTANCE;
	}
	
	//need to overwrite to run in DS
	private Object readResolve() {
		return getInstnace();
	}
}
