import java.util.Scanner;
class voter {
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Your Age: ");
    int age=input.nextInt();
    if(age>=18){
        System.out.println("Congrats Bro! Your are Eligible to Vote.");
    }else{
        System.out.println("You are NOT Eligible to Vote.");
    }
    input.close();
}
}
