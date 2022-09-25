public class AgeUserCheckService implements IUserCheckService {
    //Method
    public boolean checkUser(User user){
        if(user.getAge() >= 18){
            return true;
        }
        return false;
    }
}
