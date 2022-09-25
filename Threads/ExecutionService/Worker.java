public class Worker implements Runnable {
    private String name;
    private int taskid;

    

    public Worker(String name, int taskid) {
        this.name = name;
        this.taskid = taskid;
    }



    public void run(){
        System.out.println("Worker with name " + this.name + " and " + "Task Id " + taskid + " started the work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Worker with name " + this.name + " and " + "Task Id " + taskid + " finished the work");
        
    }
}
