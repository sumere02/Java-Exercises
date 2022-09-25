public class UpgradedSubscriber {
    private String name;
    private int balance = 120;
    private String city;
    
    public UpgradedSubscriber(String name, int balance, String city) {
        this.name = name;
        if(balance <= 120 && balance >= 0){
            this.balance = balance;
        }
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void use_gas(int amount){
        if(amount > balance){
            System.out.println("Unsifficent Balance");
        }
        else{
            this.balance -= amount;
            if(balance <= 0){
                System.out.println("Balance is empty, Please go to near gas station");
            }
            else{
                System.out.println("Balance: " + this.balance);
            }
        }
    }

    public void show_balance(){
        System.out.println("Balance: " + this.balance);
    }
    
}
