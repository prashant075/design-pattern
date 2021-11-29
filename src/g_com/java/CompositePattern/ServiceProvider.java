package g_com.java.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider implements Service {
	
	private List<Service> serviceList = new ArrayList<>();

	@Override
	public void service(String serviceType) {
		for(Service s : serviceList) {
			s.service(serviceType);
		}
	}
	
	public void addService(Service service) {
		serviceList.add(service);
	}
	
	public void removeService(Service service) {
		serviceList.remove(service);
	}
	
	public void ClearService(Service service) {
		serviceList.clear();
	}
	
	

}
