import java.util.Scanner;
class Area_Rectangle {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Length  Rectangel: ");
        double length=input.nextDouble();
        System.out.print("Enter the Breadth  Rectangel: ");
        double breadth=input.nextDouble();
        double area=length*breadth;
        System.out.println("The Area of Rectangle is: "+area);
        input.close();
    }
}
