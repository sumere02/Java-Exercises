public class Account {
    private String account;
    private Double amount;
    private String name;
    private String email;
    private String tel;

    //Constructor
    //Default Constructor
    public Account(){
        this("NULL",0.0,"NULL","NULL","NULL");
        /* 
        this.account = "NULL";
        this.amount = 0.0;
        this.name = "NULL";
        this.email = "NULL";
        this.tel = "NULL";
        */
    }
    //Method Overloading
    public Account(String account,Double amount,String name,String email,String tel){
        this.account = account;
        this.amount = amount;
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getAccount(){
        return this.account;
    }
    public void setAmount(Double amount){
        this.amount = amount;
    }

    public Double getAmount(){
        return this.amount;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    public String getTel(){
        return this.tel;
    }

    public void deposit(double amount){
        this.amount += amount;
        System.out.println("Account Money: " + this.amount);
    }
    public void withdraw(double amount){
        if(amount <= this.amount){
            this.amount -= amount;
            System.out.println("Account Money: "+ this.amount);
        }
        else{
            System.out.println("Not enough money");
            System.out.println("Account Money: " + this.amount);
        }
    }
    public void showInfo(){
        System.out.println("Account No: " + this.account);
        System.out.println("Cash Amount: " + this.amount);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Tel: " + this.tel);
        
    }
}
