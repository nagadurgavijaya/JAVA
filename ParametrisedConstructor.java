import java.io.*;
class Rectangle{
    Rectangle(int l,int b){
        int a;
        a=l*b;
    }
}
public class ParametrisedConstructor{
    public static void main(String args[]){
        Rectangle r = new Rectangle(5,8);
        System.out.println("Area of Rectangle "+ r.a);
    }
}
