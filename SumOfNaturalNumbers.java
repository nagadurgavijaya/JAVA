import java.io.*;
import java.util.*;
public class SumOfNaturalIntegers{
public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter an integer :");
    int sum=0;
    int n=Sc.nextInt();
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    System.out.println("Sum of first"+n+"natural numbers is"+sum);
}
}