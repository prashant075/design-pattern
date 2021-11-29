package a_com.java.singletonPattern.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import a_com.java.singletonPattern.A_SingletonStatic;
import a_com.java.singletonPattern.B_SingletonLazy;
import a_com.java.singletonPattern.D_SingletonBillBurg;
import a_com.java.singletonPattern.Singleton;

public class ClientTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstnace();
		Singleton s2 = Singleton.getInstnace();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		A_SingletonStatic s3 = A_SingletonStatic.getInstnace();
		A_SingletonStatic s4 = A_SingletonStatic.getInstnace();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		B_SingletonLazy s5 = B_SingletonLazy.getInstnace();
		B_SingletonLazy s6 = B_SingletonLazy.getInstnace();
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		ExecutorService ex = null;
		
		try {
			MyThread thread = new MyThread();
			ex = Executors.newFixedThreadPool(2);
			ex.execute(thread);
			ex.execute(thread);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ex!=null){
				ex.shutdown();
			}
		}
		
		
	}
}
