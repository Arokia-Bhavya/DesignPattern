package prototype;

import java.util.Objects;

public class SavingsAccount extends Account{
	
	public int annualInterestRate;
	
	public SavingsAccount()
	{
		
	}

	public SavingsAccount(SavingsAccount savingsAccount) {
		super(savingsAccount);
		this.annualInterestRate=savingsAccount.annualInterestRate;
	}

	@Override
	public Account clone() {		
		return new SavingsAccount(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(annualInterestRate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return annualInterestRate == other.annualInterestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [annualInterestRate=" + annualInterestRate + ", owner=" + owner + ", balance=" + balance
				+ "]";
	}
	

}
