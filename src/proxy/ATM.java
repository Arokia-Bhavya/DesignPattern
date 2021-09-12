package proxy;

public class ATM implements Bank{
	BankBranch branch=new BankBranch();

	@Override
	public void withdraw() {
		branch.withdraw();	
	}

	@Override
	public void deposit() {
		branch.deposit();		
	}

	@Override
	public void transfer() {
		branch.transfer();
	}

	@Override
	public void changePersonalInfo() {
		branch.changePersonalInfo();
	}

}
