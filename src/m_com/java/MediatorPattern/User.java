package m_com.java.MediatorPattern;

public abstract class User {

	private ChattingMediator chattingMediator;
	private String UserName;
	public User(ChattingMediator chattingMediator, String userName) {
		super();
		this.chattingMediator = chattingMediator;
		UserName = userName;
	}
	public String getUserName() {
		return UserName;
	}
	public ChattingMediator getChattingMediator() {
		return chattingMediator;
	}
	
	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);
	
}
