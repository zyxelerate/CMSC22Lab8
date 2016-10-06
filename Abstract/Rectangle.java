public class Rectangle extends Shape{
 protected double width;
 protected double length;
 
 public Rectangle(){
  this(1.0, 1.0);
 }

 public Rectangle(double width, double length){
  this.width = width;
  this.length = length;
 }

 public Rectangle(double width, double length, String color, boolean filled){
  super(color, filled);
  this.width = width;
  this.length = length;
 }

 public double getWidth(){
  return width;
 }

 public void setWidth(double width){
  this.width = width;
 }

 public double getLength(){
  return length;
 }

 public void setLength(double length){
  this.length = length;
 }

 public double getArea(){
  return length * width;
 }

 public double getPerimeter(){
  return (2 * width) + (2 * length);
 }

 public String toString(){
  String s =  String.format("A rectangle with width = %.2f and length = %.2f, which is a subclass of %s", width, length, super.toString());
  return s;
 }


}