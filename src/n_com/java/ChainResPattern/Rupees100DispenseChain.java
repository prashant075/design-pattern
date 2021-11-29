package n_com.java.ChainResPattern;

public class Rupees100DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain m) {
		this.moneyDispenseChain =m;

	}

	@Override
	public void dispense(Currency c) {
		if(c.getAmount()>=100) {
			int numberofNotes = c.getAmount()/100;
			int rem = c.getAmount() % 100;
			System.out.println("Despening " + numberofNotes +" of Rs 100");
			if(rem !=0) {
				moneyDispenseChain.dispense(new Currency(rem));
			}
		}else {
			moneyDispenseChain.dispense(c);
		}

	}

}
