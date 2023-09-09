import java.io.*;
class Rectangle{
    int l,b,a;
    Rectangle(Rectangle r){
        this.l=r.l;
        this.b=r.b;
        this.a=l*b;
    }
}
public class CopyConstructorDemo{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.l=5;
        r1.b=8;
        Rectangle r2=new Rectangle(r1);
        System.out.println("Area of Rectangle "+ r2.a);
        
        System.out.println("Area of Rectangle "+ r1.a);
    }
}
