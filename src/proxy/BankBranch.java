package proxy;

public class BankBranch implements Bank{

	@Override
	public void withdraw() {
		System.out.println("withdrawing operation takes place at the branch");		
	}

	@Override
	public void deposit() {
		System.out.println("depositing operation takes place at the branch");		
	}

	@Override
	public void transfer() {
		System.out.println("transferring operation takes place at the branch");		
	}

	@Override
	public void changePersonalInfo() {
		System.out.println("changing PersonalInfo operation takes place at the branch");		
	}

}
