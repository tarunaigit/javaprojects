import java.util.*;
import java.util.Scanner;

public class Calculator
{
public static void main(String [] args)
{
float x,y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First number :");
x=sc.nextFloat();
System.out.println("Enter Second number :");
y=sc.nextFloat();
System.out.println("Addition ="+(x+y));
System.out.println("Subtraction ="+(x-y));
System.out.println("Multiplication ="+(x*y));
System.out.println("Division ="+(x/y));
}
}