import java.util.Scanner;
class Compound_Interest {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter Principle Amount: ");
        int principle=input.nextInt();
        System.out.printf("Enter Rate of Interest (r): ");
        double rate=input.nextDouble();
        rate=rate/100;
        System.out.printf("Enter No of times Componded per year: ");
        int n=input.nextInt();
        System.out.printf("Enter no of years: ");
        int year=input.nextInt();
        double amount=principle*Math.pow(1+rate/n,n*year);
        System.out.printf("total amount: %,d\n ",(int)amount);
        System.out.print("Compound Interest= "+(amount-principle));
        input.close();
    }
}
