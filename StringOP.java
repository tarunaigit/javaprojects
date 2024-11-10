import java.util.*;
import java.util.Scanner;

public class StringOP 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str1,str2,str3,str4;
        System.out.println("Enter a string :");
        str1=sc.nextLine();
        System.out.println("STRING LENGTH  =  "+str1.length());
        str2 = str1;
	System.out.println("COPIED STRING = "+str2);
        System.out.println("Enter a string :");
        str3=sc.nextLine();
        System.out.println("CONCATENATED STRING = "+str1.concat(str3));
        System.out.println("Enter a string :");
        str4=sc.nextLine();
        System.out.println("ORIGINAL STRING = "+str4);
        System.out.println("TRIMMED STRING = "+str4.trim());        
    }
}