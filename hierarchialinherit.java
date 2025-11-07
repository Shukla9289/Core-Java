/*Program to check the area and perimeter of rectangle & circle by inputing the side 
using hierarchial inheritance*/
import java.util.Scanner;
class Shape{
    void getData(){
        System.out.println("Enter the Required Dimmension");
    }
    void area(){
        System.out.println("Area of Shape");
    }
    void perimeter(){
        System.out.println("Perimeter of Shape");
    }
}
class Circle extends Shape{
    double radius;
    void getData(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the radius of circle :");
    radius=sc.nextDouble();
    }
    void area(){
    double Area=3.14*radius*radius;
    System.out.println("Area of circle :"+Area);
    }
    void perimeter(){
    double p=2*3.14*radius;
    System.out.println("Perimeter of Circle is:"+p);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    void getData(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter the length of rectangle :");
    length=sc.nextInt();
    System.out.print("Enter the breadth of rectangle :");
    breadth=sc.nextInt();
    }
    void area(){
    double Area=length*breadth;
    System.out.println("Area of Rectangle :"+Area);
    }
    void perimeter(){
    double p=2*(length+breadth);
    System.out.println("Perimeter of Rectangle is:"+p);
    }
}
class Main{
    public static void main(String[] args) {

        // Circle
        Circle c = new Circle();
        c.getData();
        c.area();
        c.perimeter();

        // Rectangle
        Rectangle r = new Rectangle();
        r.getData();
        r.area();
        r.perimeter();

    }
}