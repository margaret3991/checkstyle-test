// Margaret Lanphere
// C SCI 143 Java II
// Chapter 9: Programming Project 2

public class Exercise09_09 {
   public static void main(String[] args) {
      //Test 
      RegularPolygon P1 = new RegularPolygon();
      RegularPolygon P2 = new RegularPolygon(6,4);
      RegularPolygon P3 = new RegularPolygon(10,4,5.6,7.8);
      
      System.out.println("Polygon 1 perimeter: " + P1.getPerimeter());
      System.out.println("Polygon 1 area: " + P1.getArea());
      System.out.println("Polygon 2 perimeter: " + P2.getPerimeter());
      System.out.println("Polygon 2 area: " + P2.getArea());
      System.out.println("Polygon 3 perimeter: " + P3.getPerimeter());
      System.out.println("Polygon 3 area: " + P3.getArea());
   }
}
   
class RegularPolygon{
   //Fields
   private int n = 3;
   private double side = 1;
   private double x = 0;
   private double y = 0;
      
   public RegularPolygon() {
   }
      
   public RegularPolygon(int sideNum, double sideLength) {
      n = sideNum;
      side = sideLength;
   }
      
   public RegularPolygon(int sideNum, double sideLength, double xCoord, double yCoord) {
      n = sideNum;
      side = sideLength;
      x = xCoord;
      y = yCoord;
   }
      
   //Accessors
   public int getN() {
      return n;
   }
      
   public double getSide(){
      return side;
   }
      
   public double getX() {
      return x;
   }
      
   public double getY(){
      return y;
   }
      
   //Mutators
   public void setN(int newN) {
      n = newN;
   }
      
   public void setSide(double newL) {
      side = newL;
   }
      
   public void setX(double newX) {
      x = newX;
   }
      
   public void setY(double newY) {
      y = newY;
   }
      
   //Area and Perimeter
   public double getPerimeter(){
      return (n*side);
   }
      
   public double getArea(){
      return ((side*side)*n)/(Math.tan((Math.PI)/n)*4);
   }
}
  
