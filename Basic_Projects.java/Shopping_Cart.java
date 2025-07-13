 import java.util.Scanner;
class Shopping {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Which item do you want to buy?: ");
        String item=input.nextLine();
        System.out.print("What is the price of the item: ");
        double price=input.nextDouble();
        System.out.print("How many would you like to buy: ");
        double n=input.nextDouble();
        System.out.println("You have Bought "+(int)n+" "+item+"'s.");
        System.out.printf("You should pay $"+(n*price)+".");
        input.close();

    }
}
