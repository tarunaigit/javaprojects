import java.util.*;
import java.util.Scanner;

public class SI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float SI,P,R,T;
        System.out.println("Enter Principal Amount :");
        P=sc.nextFloat();
        System.out.println("Enter Rate :");
        R=sc.nextFloat();
        System.out.println("Enter Time in years :");
        T=sc.nextFloat();
        SI=(P*R*T)/100;                                                                       
        System.out.printf("Simple Interest = %.2f",SI);
        sc.close();
    }

}