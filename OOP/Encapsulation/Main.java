public class Main{
    public static void main(String[] args) {
        /*
        Subscriber subscriber = new Subscriber();
        subscriber.name = "Emir";
        subscriber.balance = 200;
        subscriber.city = "Istanbul";
        subscriber.use_gas(200);
        */
        UpgradedSubscriber subscriber = new UpgradedSubscriber("Emir", 130, "Istanbul");
        subscriber.show_balance();
    }
}