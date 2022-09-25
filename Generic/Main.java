import java.util.Scanner;

public class Main{
    
    static Scanner scanner = new Scanner(System.in);

    //Returns biggest point student
    public static <E extends Person> E cmpst(E st_1,E st_2,E st_3){
        return (st_1.pointCalculate() > st_2.pointCalculate() && st_1.pointCalculate() > st_3.pointCalculate()) ? st_1:(st_2.pointCalculate() > st_3.pointCalculate() ? st_2:st_3);
    }
    
    public static void main(String[] args) {
        System.out.println("TYT-AYT Result Calculator");
        System.out.println("*******************************");
        while(true){
            System.out.println("1.First Literaturetical Student");
            System.out.println("2.First Mathematical Student");
            System.out.println("Q.Exit");
            System.out.println("*******************************");
            System.out.print("Operation: ");
            char op = scanner.nextLine().charAt(0);
            if(op == 'Q'){
                System.out.println("Good Day");
                return;
            }
            else if(op == '1'){
                LtrSt st_1_e = new LtrSt(30,30,30,30,"Semih");
                LtrSt st_2_e = new LtrSt(35,35,35,35,"Yusuf");
                LtrSt st_3_e = new LtrSt(40,40,40,40,"Rana");
                LtrSt first_st_e = cmpst(st_1_e, st_2_e, st_3_e);
                System.out.println("Name: " + first_st_e.getName() + " Point: " + first_st_e.pointCalculate());
                
            }
            else if(op =='2'){
                MtSt st_1_m = new MtSt(30,30,30,30,"Sertuğ");
                MtSt st_2_m = new MtSt(35,35,35,35,"Emir");
                MtSt st_3_m = new MtSt(40,40,40,40,"Bilal");
                MtSt first_st_m = cmpst(st_1_m, st_2_m, st_3_m);
                System.out.println("Name: " + first_st_m.getName() + " Point: " + first_st_m.pointCalculate());
            }
            else{
                System.out.println("Invalid Operation");
            }

        }
    }
}