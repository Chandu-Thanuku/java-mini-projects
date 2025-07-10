import java.util.Scanner;
class Calculator {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        double num1;
        double num2;
        String operator;

        System.out.print("Enter First Number: ");
        num1=input.nextDouble();
        System.out.print("Enter Second Number: ");
        num2=input.nextDouble();
        input.nextLine(); // used for to create scan for \n
        System.out.print("Enter Operator that you want to perform Operation:\n ");
        System.out.print(" '+' or '-' or '*' or '/' or '^'  : ");
         operator=input.nextLine();
        switch(operator){
            case "+"-> System.out.println(num1+" + "+num2+" = "+(num1+num2));
            case "-"-> System.out.println(num1+" - "+num2+" = "+(num1-num2));
            case "*"-> System.out.println(num1+" x "+num2+" = "+(num1*num2));
            case "/"->{
                if(num2==0){
                    System.out.println("Cant divided by Zero");
                }else{
                System.out.println(num1+" / "+num2+" = "+(num1/num2));}
            }
            case "^"-> System.out.println(num1+" + "+num2+" = "+(num1+num2));
            default-> System.out.println("Invalid operator");

        }



        input.close();
    }
}
