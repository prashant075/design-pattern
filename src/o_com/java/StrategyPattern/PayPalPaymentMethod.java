package o_com.java.StrategyPattern;

public class PayPalPaymentMethod implements PaymentMethod {

	private String email;
	private String password;
	
	
	


	public PayPalPaymentMethod(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}





	public String getEmail() {
		return email;
	}





	public String getPassword() {
		return password;
	}





	@Override
	public void pay(int amount) {
		System.out.println(amount + "id Paid Using PayPal ");
	}

}
