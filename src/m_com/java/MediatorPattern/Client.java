package m_com.java.MediatorPattern;

public class Client {
	public static void main(String[] args) {
		ChattingMediator cm = new ChattingMediatorImpl();
		User u1 = new UserImpl(cm,"Ok");
		User u2 = new UserImpl(cm,"sk");
		User u3 = new UserImpl(cm,"fk");
		User u4 = new UserImpl(cm,"ak");
		User u5 = new UserImpl(cm,"dk");
		
		cm.addUser(u1);
		cm.addUser(u2);
		cm.addUser(u3);
		cm.addUser(u4);
		cm.addUser(u5);
		u2.sendMessage("Hi All");
	}
}
