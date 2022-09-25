

public class Main {
    public static void main(String[] args) {
        
        Atm atm = new Atm();
        Account account = new Account("sumere20","Exiled98",25000.0);
        atm.power(account);
        System.out.println("Shutting Down..."); 
        
    }
}
