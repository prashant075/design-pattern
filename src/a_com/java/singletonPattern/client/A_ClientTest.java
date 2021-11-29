package a_com.java.singletonPattern.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import a_com.java.singletonPattern.B_SingletonLazy;
import a_com.java.singletonPattern.D_SingletonBillBurg;
import a_com.java.singletonPattern.E_SingletonEnum;
import a_com.java.singletonPattern.F_SingletonDistributedSystem;
import a_com.java.singletonPattern.G_SingletonCloning;

public class A_ClientTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		D_SingletonBillBurg D1 = D_SingletonBillBurg.getInstnace();
		D_SingletonBillBurg D2 = D_SingletonBillBurg.getInstnace();
		
		System.out.println(D1.hashCode());
		System.out.println(D2.hashCode());
		
		B_SingletonLazy b1 = B_SingletonLazy.getInstnace();
		B_SingletonLazy b2 = null;
		//reflection break singleton pattern
		Constructor<?>[] cons = B_SingletonLazy.class.getDeclaredConstructors();
		
		for(Constructor<?> c :cons) {
			c.setAccessible(true);
			Object obj = c.newInstance();
			b2 =(B_SingletonLazy)obj;
			break;
		}
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		
		E_SingletonEnum e1 = E_SingletonEnum.GETINSTANCE;
		E_SingletonEnum e2 = E_SingletonEnum.GETINSTANCE;
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		String w = e1.Welcome();
		System.out.println(w);
		
		
		//seralize
		ObjectOutput op =null;
		F_SingletonDistributedSystem f1 = F_SingletonDistributedSystem.getInstnace();
		F_SingletonDistributedSystem f2 = null;
			try {
				op = new ObjectOutputStream(new FileOutputStream("Sing.txt"));
				op.writeObject(f1);
				op.flush();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(op != null) {
					op.close();
				}
			}
			
			
		//Deseralize
		ObjectInput oi =null;
		try {
			oi = new ObjectInputStream(new FileInputStream("Sing.txt"));
			Object obj  =oi.readObject();
			f2 = (F_SingletonDistributedSystem)obj;
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(oi != null) {
				oi.close();
			}
		}
		
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		
		G_SingletonCloning g1 = G_SingletonCloning.getInstnace();
		G_SingletonCloning g2 =null;
		try {
			 g2 = (G_SingletonCloning) g1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
	}
}
