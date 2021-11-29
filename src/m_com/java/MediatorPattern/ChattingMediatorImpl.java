package m_com.java.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChattingMediatorImpl implements ChattingMediator {

	private List<User> userList;
	
	
	public ChattingMediatorImpl() {
		userList = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
	
		for(User u:userList) {
			if(!u.getUserName().equalsIgnoreCase(user.getUserName())) {
					u.receiveMessage(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);

	}

}
