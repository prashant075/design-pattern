package n_com.java.ChainResPattern;

public class Rupees2000DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain m) {
		this.moneyDispenseChain =m;

	}

	@Override
	public void dispense(Currency c) {
		if(c.getAmount()>=2000) {
			int numberofNotes = c.getAmount()/2000;
			int rem = c.getAmount() % 2000;
			System.out.println("Despening " + numberofNotes +" of Rs 2000");
			if(rem !=0) {
				moneyDispenseChain.dispense(new Currency(rem));
			}
		}else {
			moneyDispenseChain.dispense(c);
		}

	}

	

}
