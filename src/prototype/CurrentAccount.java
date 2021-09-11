package prototype;

import java.util.Objects;

public class CurrentAccount extends Account {
	public int inSufficientFees;
	public CurrentAccount()
	{
		
	}
	public CurrentAccount(CurrentAccount target)
	{
		super(target);
		this.inSufficientFees=target.inSufficientFees;
	}


	@Override
	public Account clone() {		
		return new CurrentAccount(this);

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(inSufficientFees);
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
		CurrentAccount other = (CurrentAccount) obj;
		return inSufficientFees == other.inSufficientFees;
	}
	@Override
	public String toString() {
		return "CurrentAccount [inSufficientFees=" + inSufficientFees + ", owner=" + owner + ", balance=" + balance
				+ "]";
	}

}
