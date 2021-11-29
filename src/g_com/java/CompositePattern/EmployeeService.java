package g_com.java.CompositePattern;

public class EmployeeService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType +"Employee Type");

	}

}
