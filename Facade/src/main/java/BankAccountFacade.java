
public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;

	WelcomeToBank bankWelcome;

	public BankAccountFacade(int newAcctNum, int newSecCode) {
		accountNumber = newAcctNum;
		securityCode = newSecCode;

		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashAmount) {
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(securityCode) &&
				fundChecker.haveEnoughMoney(cashAmount)) {
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction failed\n");
		}
	}

	public void depositCash(double toDeposit) {
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(securityCode)) {
			fundChecker.makeDeposit(toDeposit);

			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction failed\n");
		}
	}
}
