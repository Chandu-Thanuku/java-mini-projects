 import java.util.Scanner;
class Quizz_game {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("<--------Welcome to QUIZZ Game-------->");
        String[] que = {"1.Addition of 2+2=___", "2.Multiplication of 19x8=___"
                , "3.Indepence Day___", "4.Current ICT Test Captain?",
                "5.Who won 3rd Test of Ind Vs England"};
        String[][] opt = {{"1. FOUR", "2. SIX", "3. TEN", "4.NoNe"},
                {"1. 134", "2. 152", "3. 198", "4. 162"},
                {"1.!5th Aug", "2. Jan 30th", " 3.Oct 2nd", "4. None"},
                {"1. Gill", "2. ROhIT", "3. KOHLI", "4. BOOM BOOM"},
                {"1. IND", "2. England", "3. TIED", "4. NO RESULT"}};
        int[] answers={1,4,1,1,2};
        int score=0;
        for (int i = 0; i < que.length; i++) {
            System.out.println(que[i]);
            for (String options : opt[i]) {
                System.out.println(options);

            }
            System.out.print("Enter Your Option: ");
            int option=input.nextInt();
            if(option==answers[i]){
                System.out.println("✅✅✅✅CORRECT✅✅✅✅");
                score++;
            }else{
                System.out.println("❌❌❌❌WRONG❌❌❌❌");
            }
        }
        System.out.print("Thanx for playing.\nYou Scored "+score+" out of 5.");
        input.close();
    }
}
