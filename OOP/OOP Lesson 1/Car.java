public class Car {
    private String color;
    private int door_num;
    private int tyres;
    private String motor;
    private String model;


    /*Kapsülleme nesne yönelimli programlamada herhangi bir nesnenin metotlarını, 
    verilerini ve değiskenlerini diğer nesnelerden saklayarak ve bunlara erişimini 
    sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir. */
    //SetterGettermodules
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setDoor_num(int num){
        this.door_num = num;
    }
    public int getDoor_num(){
        return this.door_num;
    }
    public void setTyres(int num){
        tyres = num;
    }
    public int getTyres(){
        return this.tyres;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    public String getMotor(){
        return this.motor;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
