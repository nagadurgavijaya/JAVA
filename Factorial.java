import java.io.*;
import java.util.*;
public class Factorial{
public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter n value to find factorial :");
    int fact=1;
    int n=Sc.nextInt();
    for(int i=2;i<=n;i++){
        fact=fact+i;
    }
    System.out.println("Factorial "+n+"is"+fact);
}
}