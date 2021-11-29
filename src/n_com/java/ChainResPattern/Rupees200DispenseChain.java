package n_com.java.ChainResPattern;

public class Rupees200DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain m) {
		this.moneyDispenseChain =m;

	}

	@Override
	public void dispense(Currency c) {
		if(c.getAmount()>=200) {
			int numberofNotes = c.getAmount()/200;
			int rem = c.getAmount() % 200;
			System.out.println("Despening " + numberofNotes +" of Rs 200");
			if(rem !=0) {
				moneyDispenseChain.dispense(new Currency(rem));
			}
		}else {
			moneyDispenseChain.dispense(c);
		}

	}

}
