package integration;

import bank.domain.Account;

public class EmailSender implements IObserver {
	public void sendEmail(String message) {
		System.out.println("Email Sender: " + message);
	}

	public void update(Account account) {
		String emailstring = "Account " + account.getAccountnumber() + " is changed, new balance = "
				+ account.getBalance();
		sendEmail(emailstring);
	}
}
