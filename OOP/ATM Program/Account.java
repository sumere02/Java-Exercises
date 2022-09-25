public class Account {
    private String user_id;
    private String password;
    private Double cash;

    //Constructor
    public Account(String user_id,String password,Double cash){
        this.user_id = user_id;
        this.password = password;
        this.cash = cash;
    }
    public void setUser(String user_id){
        this.user_id = user_id;
    }
    public String getUser(){
        return this.user_id;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setCash(Double cash){
        this.cash = cash;
    }
    public Double getCash(){
        return this.cash;
    }
    public void deposit(Double amount){
        this.cash += amount;
        System.out.println("Account Money: " + this.cash);
    }
    public void withdraw(Double amount){
        if(amount > this.cash){
            System.out.println("Not enough money");
            System.out.println("Account Money: " + this.cash);
        }
        else{
            this.cash -= amount;
            System.out.println("Account Money: " + this.cash);
        }
    }     
}
