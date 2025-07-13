import java.util.Scanner;
 class banking {
     public static void main(String args[]){
    Scanner input=new Scanner(System.in);
  double balance=0.0;
  double withdraw,deposit;
    int option;


    do{
        display();
        System.out.print("Enter your Option: ");
        option=input.nextInt();
        switch(option){

            case 1-> {
                System.out.println("Your Blance= " + balance);
                break;
            }
            case 2-> {
                System.out.print("Enter Amount to Deposit: ");
                deposit=input.nextDouble();
                balance+=deposit;
                break;
            }
            case 3->{
                System.out.println("Enter Amount to Withdraw: ");
                withdraw=input.nextDouble();
                if(withdraw>balance){
                    System.out.println("You Dont have that much of Balance.");
                }else{
                    System.out.println("Your Withdrawl Amount= "+withdraw);
                    balance-=withdraw;
                }
                break;
            }
            case 4->{
                System.out.println("Thanks for Using my Bank.");
                break;
            }
            default-> System.out.println("INVALID OPTION!");
        }




    }while(option!=4);




input.close();
     }
     static void display(){
         System.out.println("--------->BANKING_PROGRAM<---------");
         System.out.println("1.Balance");
         System.out.println("2.Deposit");
         System.out.println("3.WithDraw");
         System.out.println("4.Exit");

     }

}
