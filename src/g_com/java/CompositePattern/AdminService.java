package g_com.java.CompositePattern;

public class AdminService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType +"Admin Type");

	}

}
