public class Main{
    public static void main(String[] args) {
        class Area{
            public void CircleArea(int r){
                System.out.println("Area Of Circle: " + r*r*Math.PI);
            }
        }

        Area area = new Area();
        area.CircleArea(5);
    }

    //Class is local
    /*
    public static void temproary(){
        Area area_1 = new Area();
    }
    */
}