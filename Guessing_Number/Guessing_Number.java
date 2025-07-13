import java.util.Random;
import java.util.Scanner;
 class Guessing_number {
     public static void main(String args[]){
         Random random=new Random();
         int num=random.nextInt(1,51);
         Scanner input=new Scanner(System.in);
         int x=0,y=0;
         System.out.print("Enter your Guessing number Between 1-50: ");
         while(num!=x){
         x=input.nextInt();
         y++;

         if(num<x){
             System.out.print("You are too high..Guess again: ");
         }else if(num>x){
             System.out.print("You are too low..Guess again: ");
         }else{
             break;
         }

         }
         System.out.println("You Got it Bro..Number is: "+num+"\nYOU WON THE GAME AFter "+y+ " Attempts.");
         input.close();
     }
}
