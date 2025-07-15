import java.util.Scanner;
import java.util.Random;
class Rock_paper_Scissor {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        boolean next=true;
        String[] opt={"Rock","Paper","Scissor"};
        System.out.println("<-------Welcome to ROCK_PAPER_SCISSOR_Game------->");
        do{
        System.out.print("Choose Yours (Rock/Paper/Scissor): ");
        String choose=input.nextLine();
        if(choose.equalsIgnoreCase("Rock")||choose.equalsIgnoreCase("Paper")||
                choose.equalsIgnoreCase("Scissor")) {
            String computer = opt[random.nextInt(0, 3)];
            System.out.println("Computer Choosed: " + computer);
            if (choose.equalsIgnoreCase(computer)) {
                System.out.println("Game Tie.");
            } else if ((choose.equalsIgnoreCase("Rock") && computer.equals("Scissor")) ||
                    (choose.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                    (choose.equalsIgnoreCase("Scissor") && computer.equals("Paper"))) {
                System.out.println("You Won!");
            } else {
                System.out.println("You Loose");
            }
        }else{
            System.out.println("Invalid Choice!");
        }
        System.out.print("Do You want to play again?(0/1): ");
                 int a=input.nextInt();
                 input.nextLine();
        if(a==0){
            next=false;
        }else if(a==1 ){
            continue;
        }else{
            System.out.println("Invalid Choice!");
            break;
        }
        }while(next);
        System.out.println("Thanx for Playing..");
        input.close();
    }
}
