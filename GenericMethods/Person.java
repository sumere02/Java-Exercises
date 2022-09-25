public abstract class Person {
    private int tur;
    private int math;
    private int ltr;
    private int phy;
    public Person(int tur, int math, int ltr, int phy) {
        this.tur = tur;
        this.math = math;
        this.ltr = ltr;
        this.phy = phy;
    }
    public int getTur() {
        return tur;
    }
    public void setTur(int tur) {
        this.tur = tur;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getLtr() {
        return ltr;
    }
    public void setLtr(int ltr) {
        this.ltr = ltr;
    }
    public int getPhy() {
        return phy;
    }
    public void setPhy(int phy) {
        this.phy = phy;
    }
    
    abstract int pointCalculate();
    
}
