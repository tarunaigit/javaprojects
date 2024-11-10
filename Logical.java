import java.util.*;
import java.util.Scanner;

public class Logical 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter First Number :");
        num1=sc.nextInt();
        System.out.println("Enter Second Number :");
        num2=sc.nextInt();
        System.out.println("Logical AND = "+((num1>5)&&(num2<10)));
        System.out.println("Logical OR = "+((num1>5)||(num2<10)));
        System.out.println("Logical NOT for num1 = "+!(num1>5));
        System.out.println("Logical NOT for num2 = "+!(num2<10));
        sc.close();
    }
}