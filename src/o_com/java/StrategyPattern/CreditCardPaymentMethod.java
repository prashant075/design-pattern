package o_com.java.StrategyPattern;

public class CreditCardPaymentMethod implements PaymentMethod {

	private String cardHolderName;
	private String card;
	private String cvv;
	private String dateofExp;
	
	
	public CreditCardPaymentMethod(String cardHolderName, String card, String cvv, String dateofExp) {
		super();
		this.cardHolderName = cardHolderName;
		this.card = card;
		this.cvv = cvv;
		this.dateofExp = dateofExp;
	}


	public String getCardHolderName() {
		return cardHolderName;
	}


	public String getCard() {
		return card;
	}


	public String getCvv() {
		return cvv;
	}


	public String getDateofExp() {
		return dateofExp;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount + "id Paid Using Credit Card "+card);
	}

}
