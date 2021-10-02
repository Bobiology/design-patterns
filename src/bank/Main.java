package bank;
/**
 * 
 * @author sakawaelijahbob
 *
 */

public class Main {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(20);
		account.withdraw(13);
		System.out.println(account.getBalance());
	}

}
