public class Main{
    public static void main(String[] args) {
        //IEngineer engineer_1 = new Ceng(false,false);
        Ceng engineer_1 = new Ceng(false,false);
        engineer_1.soldier_state();
        engineer_1.check_record();
        System.out.println(engineer_1.gpa(3.30));
        String[] exp = {"Vestel","Havelsan","Turksat"};
        engineer_1.experience(exp);
        System.out.println("**************************");
        /* 
            IEngineer engineer_2 = new Meng(true,false);
            ((Meng)engineer_2).reference_get(ref); 
        */
        
        Meng engineer_2 = new Meng(true,false);
        String[] ref = {"Hayri Turgut Uyar","Feza Buzluca"};
        engineer_2.soldier_state();
        engineer_2.check_record();
        System.out.println(engineer_2.gpa(2.31));
        exp = new String[]{};
        engineer_2.experience(exp);
        engineer_2.reference_get(ref);
        engineer_2.work();   
    }
}