public class RestricteAccount extends user{

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance || amount > 500)
            return false;
        balance = balance - amount;
        return true;
    }

	public void deposit(double amount) {
        balance = balance  + amount;
    }

	public void Transfer(double amount) {
		 balance = balance - amount;
		
	}
    
}
