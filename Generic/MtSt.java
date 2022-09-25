public class MtSt extends Person{
    
    public MtSt(int tur, int math, int ltr, int phy,String name) {
        super(tur, math, ltr, phy,name);
    }

    @Override
    public int pointCalculate() {
        
        return getTur()*5 + getMath()*5 + getPhy()*4 + getLtr()*1;
    }
    
    
}
