 import java.util.Random;
class Toss_Game {
public static void main(String args[]){
    Random random=new Random();
 
    boolean b=random.nextBoolean();
    if(b==true){
        System.out.println("HEADS");
    }else System.out.println("Tails");
}



}
