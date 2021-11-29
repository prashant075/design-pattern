package a_com.java.singletonPattern;

public class C_SingletonThread {
	
private static  C_SingletonThread INSTANCE = null;

	private C_SingletonThread() {
		
	}
	
	/* overhead synchronized
	public static synchronized C_SingletonThread getInstnace() {
		if(INSTANCE == null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			INSTANCE = new C_SingletonThread();
			
		}
		return INSTANCE;
	}*/
	
	//Double Check locking
	public static synchronized C_SingletonThread getInstnace() {
		if(INSTANCE == null) {
			synchronized(C_SingletonThread.class) {
				if(INSTANCE == null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE = new C_SingletonThread();
				}
			}
		}
		return INSTANCE;
	}
}
