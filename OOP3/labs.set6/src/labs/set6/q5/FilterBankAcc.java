package labs.set6.q5;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class FilterBankAcc {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<BankAccount> bAccs = new HashSet<>();
		Set<BankAccount> under = new HashSet<>();
		Set<BankAccount> over = new HashSet<>();
		
		BankAccount acc1;
		BankAccount acc2;
		BankAccount acc3;
		BankAccount acc4;
		
		bAccs.add(acc1 = new BankAccount("111", 200.00));
		bAccs.add(acc2 = new BankAccount("222", 80.00));
		bAccs.add(acc3 = new BankAccount("333", 120.00));
		bAccs.add(acc4 = new BankAccount("444", 70.00));
		
		Iterator<BankAccount> it = bAccs.iterator();
		
		while(it.hasNext()) {
			BankAccount temp = it.next();
			 System.out.print("Bank Accounts: \n" + temp.toString() + "\n\n");
			//System.out.print("Bank Accounts: \n" + temp.getAccNum() + "\t\t" + temp.getBalance() + "\n\n");
			
			if(temp.getBalance() < 100) {
				under.add(temp);
			}
			else {
				over.add(temp);
			}
		}
		
		String message = "Bank Accounts under €100\n";
		
		for(BankAccount b: under) {
			message += b + "\n";
		}
		
		System.out.print(message + "\n\n");
		
		
		Iterator<BankAccount> un = under.iterator();
		
		System.out.print("Bank Accounts under €100\n");
		
		while(un.hasNext()) {
			System.out.print(un.next().toString() + ", \n");
		}
		
		Iterator<BankAccount> ov = over.iterator();
		
		System.out.print("\n\nBank Accounts over €100\n");
		
		while(ov.hasNext()) {
			System.out.print(ov.next().toString() + ", \n");
		}
	}
}
