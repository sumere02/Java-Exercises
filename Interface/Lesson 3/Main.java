public class Main{
    public static void main(String[] args) {
        SignUpManager signupmanager = new SignUpManager(new AgeUserCheckService());
        signupmanager.signUp(new User(1,"Emir",20));
    }

}