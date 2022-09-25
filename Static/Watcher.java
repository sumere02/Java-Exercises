public class Watcher{
    private String name;
    private static int numberOfPerson = 0; 

    public static String getPersonNumber(){
        return numberOfPerson + " person is watching.";
    }
    public Watcher(String name){
        numberOfPerson++;
        this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void watchGame(){
        System.out.println(name + " is watching");
    }

}