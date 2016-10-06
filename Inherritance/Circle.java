public class Circle extends Shape{
 private double radius;

 public Circle(){
  this(1.0);
 }

 public Circle(double radius){
  this.radius = radius;
 }

 public Circle(double radius, String color, boolean filled){
  super(color, filled);
  this.radius = radius;
 }

 public double getRadius(){
  return radius;
 }

 public void setRadius(double radius){
  this.radius = radius;
 }
 //pi*r*r
 public double getArea(){
  return Math.PI * radius * radius;
 }
 //2*pi*r
 public double getPerimeter(){
  return Math.PI * 2 * radius;
 }

 public String toString(){
  String a = String.format("A Circle with radius = %.2f, which is a subclass of %s", radius, super.toString());
  return a;
 }
}