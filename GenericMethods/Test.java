public class Test{

    
    /*
    public static <E> void printer(E[] array){
        for(E c:array){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Character[] char_array = {'J','A','V','A'};
        Integer[] int_array = {1,2,3,4,5};
        String[] str_array = {"JAVA","PYTHON","C++"};
        Student[] student_array = {new Student("Emir"),new Student("Furkan"),new Student("Recep")};
        printer(char_array);
        System.out.println("*******************");
        printer(int_array);
        System.out.println("*******************");
        printer(str_array);
        System.out.println("*******************");
        printer(student_array);
        System.out.println("*******************");
        
    }
    */
    public static <E extends Person> E cmpst(E st_1 ,E st_2){
        return st_1.pointCalculate() > st_2.pointCalculate() ? st_1 : st_2;
    }
    public static void main(String[] args) {
        mathPerson student_1_m = new mathPerson(30,40,20,30);
        mathPerson student_2_m = new mathPerson(25,45,2,35);
        mathPerson first_st_m = cmpst(student_1_m,student_2_m);
        EA student_1_e = new EA(30,20,40,2);
        EA student_2_e = new EA(40,10,50,0);
        EA first_st_e = cmpst(student_1_e,student_2_e);
        System.out.println("Point of first student in Math Field: " + first_st_m.pointCalculate());
        System.out.println("Point of first student in Literature Field: " + first_st_e.pointCalculate());
        

    }

}