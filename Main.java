import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
	 Random r = new Random();
	 Scanner sc = new Scanner(System.in);
	 int attempts = 3;
     int comp = r.nextInt(10)+1;
	 while(attempts!=0)
	 { 	
	       System.out.println("Enter a number between 1-10 : ");
	       int PlayerGuess = sc.nextInt();
	       if(PlayerGuess < 1 || PlayerGuess > 10)
	       {
	           System.out.println("Invalid input , Try again!");
	           continue;
	       }   
	       if(PlayerGuess==comp)
	       {
	              System.out.println("Correct! You Guessed it");
	              break;
      	  }
	       else
     	  {
	             attempts--;
	             if(attempts > 0)
	             {
	             System.out.printf("Incorrect!  %d Guessess Left \n",attempts);
	             }
	             else
	             {
	                 System.out.println("Sorry , you've used all your attempts.");
	                 
	             }    
	        }  
     }
     System.out.printf("The Number was %d",comp);
	 sc.close();
	}
}