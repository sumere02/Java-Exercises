public class mathPerson extends Person{
    
    public mathPerson(int tur, int math, int ltr, int phy) {
        super(tur, math, ltr, phy);
    }

    @Override
    public int pointCalculate() {
        
        return getTur()*5 + getMath()*5 + getPhy()*4 + getLtr()*1;
    }
    
    
}
