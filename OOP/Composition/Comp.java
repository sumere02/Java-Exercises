public class Comp {
    //Compositions
    private Monitor monitor;
    private MotherBoard motherboard;
    private CompCase comp_case;

    public Comp(Monitor monitor,MotherBoard motherboard,CompCase comp_case){
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.comp_case = comp_case;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    public Monitor getMonitor(){
        return this.monitor;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public CompCase getComp_case() {
        return comp_case;
    }

    public void setComp_case(CompCase comp_case) {
        this.comp_case = comp_case;
    }

    
}
