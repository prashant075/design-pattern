package a_com.java.singletonPattern.client;

import a_com.java.singletonPattern.C_SingletonThread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		C_SingletonThread s = C_SingletonThread.getInstnace();
		System.out.println(Thread.currentThread().getId() +" =>"+s.hashCode());

	}

}
