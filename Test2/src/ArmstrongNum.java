
import java.util.Scanner;

public class ArmstrongNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in)
;       int n,c,r,arm=0,i=1;
        while(i<3)
        {
            System.out.println("Enter a number : ");
            n=sc.nextInt();
            c=n;
            while(n>0)
            {
                r=n%10;
                arm=(r*r*r)+arm;
                n=n/10;

            }
            if(c==arm)
            {
            
                System.out.println("Palindrome Number");
            }
            else
            {
                System.out.println("Not a Palindrome Number");
            }
            i++;

        }
        sc.close();
        

        
    }

}
