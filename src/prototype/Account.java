package prototype;

import java.util.Objects;

public abstract class Account {
public String owner;
public Integer balance;
public Account()
{
	
}
public Account(Account account) {
	super();
	this.owner = account.owner;
	this.balance = account.balance;
}

public abstract Account clone();

@Override
public int hashCode() {
	return Objects.hash(balance, owner);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	return Objects.equals(balance, other.balance) && Objects.equals(owner, other.owner);
}


}
