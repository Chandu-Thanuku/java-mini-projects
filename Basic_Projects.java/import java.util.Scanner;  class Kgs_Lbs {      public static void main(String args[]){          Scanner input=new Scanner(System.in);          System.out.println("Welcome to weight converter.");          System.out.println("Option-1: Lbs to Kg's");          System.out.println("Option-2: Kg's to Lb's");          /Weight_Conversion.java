import java.util.Scanner;
 class Kgs_Lbs {
     public static void main(String args[]){
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to weight converter.");
         System.out.println("Option-1: Lbs to Kg's");
         System.out.println("Option-2: Kg's to Lb's");
         // 1kg= 1 lbs x 0.453592
         int option=input.nextInt();
         if(option==1){
             System.out.println("Enter weight in Lbs: ");
             double x=input.nextDouble();
             System.out.println("Weight in Kg= "+(x*0.453592));
         }else if(option==2){
             System.out.println("Enter weight in Kg's: ");
             double x=input.nextDouble();
             System.out.println("Weight in Lbs= "+(x/0.453592));
         }else{
             System.out.println("You entered INVALID Option.");
         }
         input.close();

     }

}
