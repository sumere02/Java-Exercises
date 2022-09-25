import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SampleDeadlock {
    private Account ac1 = new Account();
    private Account ac2 = new Account();
    private Random random = new Random();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void checkLock(Lock a,Lock b){
        Boolean checkA = false;
        Boolean checkB = false;
        while(true){
            checkA = a.tryLock();
            checkB = b.tryLock();
            if(checkA && checkB){
                return;
            }
            if(checkA){
                a.unlock();
            }
            if(checkB){
                b.unlock();
            }
        }
    }
    
    public void threadOver(){
        System.out.println("Balance Account 1: " + ac1.getBalance());
        System.out.println("Balance Account 2: " + ac2.getBalance());
        System.out.println("Total Account: " + (ac1.getBalance() + ac2.getBalance()));
        
    }

    public void thread1Func(){
        checkLock(lock1,lock2);
        for(int i = 0;i<5000;i++){
            Account.cashExchange(ac1, ac2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void thread2Func(){
        checkLock(lock1,lock2);
        for(int i = 0;i<5000;i++){
            Account.cashExchange(ac2, ac1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }
}
