public class SignUpManager {
    private IUserCheckService iUserCheckService;
    
    
    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }


    public void signUp(User user){
        //AgeUserCheckService checker = new AgeUserCheckService();
        
        if(iUserCheckService.checkUser(user)){
            System.out.println(user.getName() + " registered");
        }
        else{
            System.out.println("Age must be equal or bigger than 18");
        }
        
    }
}
