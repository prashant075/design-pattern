package g_com.java.CompositePattern;

public class ClientTest {
	public static void main(String[] args) {
		Service empService1 = new EmployeeService();
		Service empService2 = new EmployeeService();
		Service admService3 = new AdminService();
		ServiceProvider sp = new ServiceProvider();
		
		sp.addService(empService1);
		sp.addService(empService2);
		sp.addService(admService3);
		
		sp.service("Registration Service");
		sp.removeService(empService1);
		
		sp.addService(new AdminService());
		System.out.println("------------------");
		sp.service("Logout Service");
	}
}
