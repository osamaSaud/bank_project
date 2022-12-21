public abstract class user {
    protected int id;
    protected String PIN;
    protected String name;
    protected double balance;
    static int count = 0;
    
    public user(){
        balance = 10000;
        id = ++count;
    }
    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
}