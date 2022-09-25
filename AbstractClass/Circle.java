public class Circle extends Shape{

    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    void calculateArea() {
        System.out.println("Area of " + getName() + " is equal to " + Math.PI*r*r);        
        
    }

    
    
}
