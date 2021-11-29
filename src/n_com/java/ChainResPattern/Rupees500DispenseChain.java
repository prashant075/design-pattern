package n_com.java.ChainResPattern;

public class Rupees500DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain m) {
		this.moneyDispenseChain =m;

	}

	@Override
	public void dispense(Currency c) {
		if(c.getAmount()>=500) {
			int numberofNotes = c.getAmount()/500;
			int rem = c.getAmount() % 500;
			System.out.println("Despening " + numberofNotes +" of Rs 500");
			if(rem !=0) {
				moneyDispenseChain.dispense(new Currency(rem));
			}
		}else {
			moneyDispenseChain.dispense(c);
		}

	}

}
