public class Account {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
        balance += amount;
    }

    public static void cashExchange(Account ac1,Account ac2,int amount){
        ac1.withdraw(amount);
        ac2.deposit(amount);
    }

    
}
