package n_com.java.ChainResPattern;

public interface MoneyDispenseChain {
	public abstract void setNextChain(MoneyDispenseChain m);
	public abstract void dispense(Currency c);
}
