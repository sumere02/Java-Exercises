public class Main {
    public static void main(String[] args) {
        Watcher person_1 = new Watcher("Emir Sümer");
        Watcher person_2 = new Watcher("Furkan Sümer");
        person_1.watchGame();
        person_2.watchGame();
        System.out.println(Watcher.getPersonNumber());
        //person_1.printNumber(); Also works but not a good way
    }
}
