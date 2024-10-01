import java.util.Scanner;
interface Shape{
 Scanner s=new Scanner(System.in);
 void getArea();
}
class Retangle implements Shape{
public void getArea(){
System.out.print("Enter the Length of the Retangle : ");
int length = s.nextInt();
System.out.print("Enter the Breadth of the Retangle : ");
int breadth = s.nextInt();
System.out.println("The area of the rectange is :" + (length * breadth));
}
}
class Circle implements Shape{
public void getArea(){
System.out.print("Enter the radius of the Circle: ");
int radius =s.nextInt();
double pi = 3.142,area;
area=pi*radius*radius;
System.out.println("The area of the Circle is: " + area);
}
}
class Triangle implements Shape{
public void getArea(){
System.out.print("Enter the height of the Triangle : ");
int base = s.nextInt();
System.out.print("Enter the Base of the Triangle : " );
int height = s.nextInt();
System.out.println("The area of the Triangle is : " + (base*height )/2);
}
}
class Area{
public static void main(String [] args){
 Shape r = new Retangle();
 r.getArea();
 Shape c = new Circle();
 c.getArea();
 Shape t = new Triangle();
 t.getArea();
}
}
