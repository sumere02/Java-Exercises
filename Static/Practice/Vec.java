public class Vec {
    private String name;
    private int i;
    private int j;
    private int k;
    public Vec(String name){
        this.name = name;
        System.out.print(this.name + " (I-J-K): ");
        this.i = Main.scanner.nextInt();
        this.j = Main.scanner.nextInt();
        this.k = Main.scanner.nextInt();
        Main.scanner.nextLine();
        //scanner.close();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
}
