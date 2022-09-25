public class LtrSt extends Person {
    public LtrSt(int tur,int math,int ltr,int phy,String name){
        super(tur,math,ltr,phy,name);
    }
    public int pointCalculate(){
        return getTur()*5 + getMath()*5 + getPhy()*1 + getLtr()*1;
    }
}
