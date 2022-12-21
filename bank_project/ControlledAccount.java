public class ControlledAccount extends user implements LimitedDeposit{

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance || amount >2000)
            return false;
        balance = balance - amount;
        return true;
    }

    @Override
    public void deposit(double amount) {
        balance = balance  + amount;
    }

    @Override
	public void Transfer(double amount) {
		 balance = balance - amount;
	}
    
}