package proxy;

public class Demo {

	public static void main(String[] args) {
		/*ATM is the proxy to the operations at the bankbranch*/
		ATM atm=new ATM();
		atm.withdraw();
		atm.deposit();
		atm.transfer();
		atm.changePersonalInfo();
	}

}
