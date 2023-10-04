//java program to add two integers
//04.09.23
//Addition.java
import java.io.*;
import java.util.*;
 public class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer:");
		int i1 = sc.nextInt();
		System.out.print("Enter second integer:");
		int i2 = sc.nextInt();
		int i3 = i1+i2;
		System.out.println("Sum of "+i1+" and "+i2+" is"+i3);
	}
}
