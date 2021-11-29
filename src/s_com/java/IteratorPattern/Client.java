package s_com.java.IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		CollectionImpl coll = new CollectionImpl();
		Iterator it = coll.getIterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name =(String)obj;
			System.out.println(name);
			
		}
	}
}
