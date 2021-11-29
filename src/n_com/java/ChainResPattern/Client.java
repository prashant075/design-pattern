package n_com.java.ChainResPattern;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		ATMMachineDispenseChain atm = new ATMMachineDispenseChain();
		Scanner Sc = null;
		while(true) {
			int amount =0;
			System.out.println("Enter Amount");
			Sc = new Scanner(System.in);
			int val = Sc.nextInt();
			
			if(val % 100!=0) {
				System.out.println("Should be mutiple of 100");
			}else {
				atm.getMoneyDispenseChain1().dispense(new Currency(val));
			}
			
		}
	}
}
