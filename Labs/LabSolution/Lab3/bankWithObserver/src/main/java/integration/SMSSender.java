package integration;

import bank.domain.Account;

public class SMSSender implements IObserver {
	public void sendSMS(String message) {
		System.out.println("SMS Sender: " + message);
	}

	public void update(Account account) {
		String smsstring = "Account " + account.getAccountnumber() + " is changed, new balance = "
				+ account.getBalance();
		sendSMS(smsstring);

	}
}
