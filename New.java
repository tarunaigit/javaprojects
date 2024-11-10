
import java.util.Scanner;

public class New 
{
    public static void main(String[] args) 
    {
        double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side x :");
        x=sc.nextDouble();
        System.out.println("Enter side y :");
        y=sc.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.printf("Hypotenuse of side %.2f and %.2f is : %.2f",x,y,z);
        sc.close();
        
        
        
    }



}
