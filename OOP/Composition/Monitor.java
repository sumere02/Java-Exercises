
public class Monitor {
    private String model;
    private String producer;
    private String size_inch;
    //Composition
    private Resolution resolution;
    public Monitor(String model, String producer, String size_inch, Resolution resolution) {
        this.model = model;
        this.producer = producer;
        this.size_inch = size_inch;
        this.resolution = resolution;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getSize_inch() {
        return size_inch;
    }
    public void setSize_inch(String size_inch) {
        this.size_inch = size_inch;
    }
    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void power_off(){
        System.out.println("Power OFF");
    }
}
