public class NormalAccoun extends user implements FreeDepositAndInquiry{

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance)
            return false;
        balance = balance - amount;
        return true;
    }

    @Override
    public void deposit(double amount) {
        balance = balance  + amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

	@Override
	public void Transfer(double amount) {
		 balance = balance - amount;
	}
    
}