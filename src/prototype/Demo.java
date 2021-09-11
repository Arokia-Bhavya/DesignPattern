package prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args)
{
	List<Account> accounts = new ArrayList<>();
    List<Account> accountsCopy = new ArrayList<>();

    SavingsAccount savingsAccount = new SavingsAccount();
    savingsAccount.annualInterestRate=4;
    savingsAccount.balance=5000;
    savingsAccount.owner="Arokia";
    accounts.add(savingsAccount);

    SavingsAccount anotherSavingsAccount = (SavingsAccount) savingsAccount.clone();

    CurrentAccount currentAccount = new CurrentAccount();
    currentAccount.inSufficientFees=10;
    currentAccount.balance=1000;
    currentAccount.owner="Arokia";
    
    CurrentAccount anotherCurrentAccount = (CurrentAccount) currentAccount.clone();
    accounts.add(savingsAccount);
    accounts.add(anotherSavingsAccount);
    accounts.add(currentAccount);
    accounts.add(anotherCurrentAccount);
    
    cloneAndCompare(accounts,accountsCopy);
}

private static void cloneAndCompare(List<Account> accounts, List<Account> accountsCopy) {
    for (Account account : accounts) {
    	accountsCopy.add(account.clone());
    }

    for (int i = 0; i < accounts.size(); i++) {
        if (accounts.get(i) != accountsCopy.get(i)) {
            System.out.println(i + ": Accounts are different objects (yay!)");
            if (accounts.get(i).equals(accountsCopy.get(i))) {
                System.out.println(i + ": And they are identical (yay!)");
            } else {
                System.out.println(i + ": But they are not identical (booo!)");
            }
        } else {
            System.out.println(i + ": Accounts objects are the same (booo!)");
        }
    }
}
}
