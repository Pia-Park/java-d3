import java.util.Scanner;

public class PerimeteOfATriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2){
            int perimeter = num1 + num2 + num3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Your number is not valid number.");
        }

    }
}