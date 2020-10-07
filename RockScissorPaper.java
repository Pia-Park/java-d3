import java.lang.Math;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Choice. scissor[0] rock[1] paper[3]");
        int choice = input.nextInt();
        int randomChoice = (int)(Math.random() * 3);

        if(choice == 0){
            if(randomChoice == 0){
                System.out.println("User : Scissor, Computer : Scissor. It is a draw.");
            } else if(randomChoice == 1){
                System.out.println("User : Scissor, Computer : Rock. Computer Win.");
            } else if(randomChoice == 2){
                System.out.println("User : Scissor, Computer : Paper. User Win.");
            }
        
        } else if(choice == 1){
            if(randomChoice == 1){
                System.out.println("User : Rock, Computer : Rock. It is a draw.");
            } else if(randomChoice == 0){
                System.out.println("User : Rock, Computer : Scissor. User Win.");
            } else if(randomChoice == 2){
                System.out.println("User : Rock, Computer : Paper. Computer win.");
            }
        } else if(choice == 2){
            if(randomChoice == 2){
                System.out.println("User : Paper, Computer : Paper. It is a draw.");
            } else if(randomChoice == 0){
                System.out.println("User : Paper, Computer : Scissor. Computer Win.");
            } else if(randomChoice == 1){
                System.out.println("User : Paper, Computer : Rock. User win.");
            }
        }
    }    
}
