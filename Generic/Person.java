public abstract class Person {
    private String name;
    private int tur;
    private int math;
    private int ltr;
    private int phy;
    public Person(int tur, int math, int ltr, int phy,String name) {
        this.tur = tur;
        this.math = math;
        this.ltr = ltr;
        this.phy = phy;
        this.name = name;
    }
    
    public int getTur() {
        return tur;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
