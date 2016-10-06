public class ShapeTest{
  public static void main(String[] args){
    //Circle Test
    Shape c1 = new Circle();
    Shape c2 = new Circle(2.0);
    Shape c3 = new Circle(3.0, "blue", false);
    Shape c4 = new Circle(3.0, "blue", true);
    
    System.out.println(c1);
//    System.out.println("Perimeter:" + c1.getPerimeter()); //Does not print because the object Shape does not have the methods getArea() and getPerimeter
//    System.out.println("Area:" + c1.getArea());
    System.out.println(c2);
//    System.out.println("Perimeter:" + c2.getPerimeter());
//    System.out.println("Area:" + c2.getArea());
    System.out.println(c3);
//    System.out.println("Perimeter:" + c3.getPerimeter());
//    System.out.println("Area:" + c3.getArea());
    System.out.println(c4);
//    System.out.println("Perimeter:" + c4.getPerimeter());
//    System.out.println("Area:" + c4.getArea());
    //Rectangle Test
    Shape r1 = new Rectangle();
    Shape r2 = new Rectangle(2.0, 3.0);
    Shape r3 = new Rectangle(3.0, 4.0, "blue", false);
    Shape r4 = new Rectangle(3.0, 4.0, "blue", true);
    
    System.out.println(r1);
//    System.out.println("Perimeter:" + c1.getPerimeter()); //Does not print because the object Shape does not have the methods getArea() and getPerimeter
//    System.out.println("Area:" + c1.getArea());
    System.out.println(r2);
//    System.out.println("Perimeter:" + c2.getPerimeter());
//    System.out.println("Area:" + c2.getArea());
    System.out.println(r3);
//    System.out.println("Perimeter:" + c3.getPerimeter());
//    System.out.println("Area:" + c3.getArea());
    System.out.println(r4);
//    System.out.println("Perimeter:" + c4.getPerimeter());
//    System.out.println("Area:" + c4.getArea());
    //Square Test
    Shape s1 = new Square();
    Shape s2 = new Square(2.0);
    Shape s3 = new Square(3.0, "blue", false);
    Shape s4 = new Square(3.0, "blue", true);
    
    System.out.println(s1);
//    System.out.println("Perimeter:" + c1.getPerimeter()); //Does not print because the object Shape does not have the methods getArea() and getPerimeter
//    System.out.println("Area:" + c1.getArea());
    System.out.println(s2);
//    System.out.println("Perimeter:" + c2.getPerimeter());
//    System.out.println("Area:" + c2.getArea());
    System.out.println(s3);
//    System.out.println("Perimeter:" + c3.getPerimeter());
//    System.out.println("Area:" + c3.getArea());
    System.out.println(s4);
//    System.out.println("Perimeter:" + c4.getPerimeter());
//    System.out.println("Area:" + c4.getArea());
  }
}