public class Main{

    public interface IStudent {
        void study();
        void enterLesson();
    }
    public static void main(String[] args) {
        IStudent student = new IStudent() {

            @Override
            public void enterLesson() {
                System.out.println("I'm Working");
            }

            @Override
            public void study() {
                System.out.println("Entering Lesson");
            }
            
        };
        student.study();
        student.enterLesson();
    }
}