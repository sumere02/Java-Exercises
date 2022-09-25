public class Subscriber {
    public String name;
    public int balance;
    public String city;
    
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
