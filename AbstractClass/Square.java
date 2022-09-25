public class Square extends Shape {

    private int side;

    public Square(String name,int side) {
        super(name);
        this.side = side;
    }

    void calculateArea() {    
        System.out.println("Area of " + getName() + " is equal to " + side*side);
    }
}
