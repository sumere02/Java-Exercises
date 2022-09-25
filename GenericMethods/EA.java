public class EA extends Person {
    public EA(int tur,int math,int ltr,int phy){
        super(tur,math,ltr,phy);
    }
    public int pointCalculate(){
        return getTur()*5 + getMath()*5 + getPhy()*1 + getLtr()*1;
    }
}
