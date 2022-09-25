public class Problem {
    public static class Mathematic{
        public static void circleArea(int r){
            System.out.println("Area Of Circle: " + Math.PI*r*r);
        }
        public static void perimeterTriangle(int side_1,int side_2, int side_3){
            int perimeter = side_1 + side_2 + side_3;
            System.out.println("Perimeter Of Triangle: " + perimeter);
        }

    }
    public static class Physics{
        public static void dotProduct(Vec vec_1,Vec vec_2){
            int dotproduct = vec_1.getI()*vec_2.getI() + vec_1.getJ()*vec_2.getJ() + vec_1.getK()*vec_2.getK();
            System.out.println("Dot product of " + vec_1.getName() + " " + vec_2.getName() + " = " + dotproduct);
        }
    }
}
